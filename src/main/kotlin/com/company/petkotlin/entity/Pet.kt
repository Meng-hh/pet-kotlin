package com.company.petkotlin.entity

import io.jmix.core.metamodel.annotation.JmixEntity
import java.time.LocalDateTime
import javax.persistence.*

@JmixEntity
@Table(name = "PET_PET", indexes = [
    Index(name = "IDX_PET_TYPE_ID", columnList = "TYPE_ID"),
    Index(name = "IDX_PET_OWNER_ID", columnList = "OWNER_ID")
])
@Entity(name = "pet_Pet")
open class Pet : NamedEntity() {
    @Column(name = "IDENTIFICATION_NUMBER")
    var identificationNumber: String? = null

    @Column(name = "BIRTHDATE")
    var birthdate: LocalDateTime? = null

    @JoinColumn(name = "TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var type: PetType? = null

    @JoinColumn(name = "OWNER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var owner: Owner? = null
}