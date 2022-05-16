package com.company.petkotlin.entity

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*

@JmixEntity(name = "pet_NamedEntity")
@MappedSuperclass
open class NamedEntity {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @Column(name = "VERSION")
    var version: Int? = null

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

    @InstanceName
    @Column(name = "NAME")
    var name: String? = null
}