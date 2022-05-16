package com.company.petkotlin.entity

import io.jmix.core.HasTimeZone
import io.jmix.core.annotation.Secret
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.entity.annotation.SystemLevel
import io.jmix.core.metamodel.annotation.DependsOnProperties
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import io.jmix.security.authentication.JmixUserDetails
import org.springframework.security.core.GrantedAuthority
import java.util.*
import javax.persistence.*

@JmixEntity
@Entity(name = "pet_User")
@Table(name = "PET_USER", indexes = [
    Index(name = "IDX_PET_USER_ON_USERNAME", columnList = "USERNAME", unique = true)
])
open class User : JmixUserDetails, HasTimeZone {

    @Id
    @Column(name = "ID", nullable = false)
    @JmixGeneratedValue
    var id: UUID? = null

    @Column(name = "TIME_ZONE_ID")
    @get:JvmName("getTimeZoneId_")
    var timeZoneId: String? = null;

    @Version
    @Column(name = "VERSION", nullable = false)
    var version: Int? = null

    @Column(name = "USERNAME", nullable = false)
    @get:JvmName("getUsername_")
    var username: String? = null

    @Secret
    @SystemLevel
    @Column(name = "PASSWORD")
    @get:JvmName("getPassword_")
    var password: String? = null

    @Column(name = "FIRST_NAME")
    var firstName: String? = null

    @Column(name = "LAST_NAME")
    var lastName: String? = null

    @Column(name = "EMAIL")
    var email: String? = null

    @Column(name = "ACTIVE")
    var active: Boolean? = true

    @Column(name = "CREATED_BY")
    var createdBy: String? = null

    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    var createdDate: Date? = null

    @Column(name = "LAST_MODIFIED_BY")
    var lastModifiedBy: String? = null

    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    var lastModifiedDate: Date? = null

    @Column(name = "DELETED_BY")
    var deletedBy: String? = null

    @Column(name = "DELETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    var deletedDate: Date? = null

    @Transient
    protected var userAuthorities: Collection<GrantedAuthority?>? = null

    override fun getPassword(): String? = password

    override fun getUsername(): String? = username

    override fun getAuthorities(): Collection<GrantedAuthority?> =
        userAuthorities ?: emptyList()

    override fun setAuthorities(authorities: Collection<GrantedAuthority?>) {
        this.userAuthorities = authorities
    }

    override fun isAccountNonExpired(): Boolean = true

    override fun isAccountNonLocked(): Boolean = true

    override fun isCredentialsNonExpired(): Boolean = true

    override fun isEnabled(): Boolean = active == true

    @get:DependsOnProperties("firstName", "lastName", "username")
    @get:InstanceName
    val displayName: String
        get() = "${firstName ?: ""} ${lastName ?: ""} [${username ?: ""}]".trim()

    override fun getTimeZoneId(): String? {
        return timeZoneId
    }

}