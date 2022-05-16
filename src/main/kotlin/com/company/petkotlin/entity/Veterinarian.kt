package com.company.petkotlin.entity

import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.*

@JmixEntity
@Table(name = "PET_VETERINARIAN")
@Entity(name = "pet_Veterinarian")
open class Veterinarian : Person() {
    @JoinTable(
        name = "PET_VET_SPECIALTY_LINK",
        joinColumns = [JoinColumn(name = "VETERINARIAN_ID")],
        inverseJoinColumns = [JoinColumn(name = "SPECIALTY_ID")]
    )
    @ManyToMany
    var specialties: MutableSet<Specialty> = mutableSetOf()
}