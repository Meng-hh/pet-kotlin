package com.company.petkotlin.entity

import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@JmixEntity
@Table(name = "PET_PET_TYPE")
@Entity(name = "pet_PetType")
open class PetType : NamedEntity() {
    @Column(name = "COLOR")
    var color: String? = null
}