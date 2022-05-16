package com.company.petkotlin.entity

import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Entity
import javax.persistence.Table

@JmixEntity
@Table(name = "PET_SPECIALTY")
@Entity(name = "pet_Specialty")
open class Specialty : NamedEntity()