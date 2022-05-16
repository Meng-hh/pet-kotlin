package com.company.petkotlin.entity

import io.jmix.core.metamodel.annotation.Composition
import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToMany
import javax.persistence.Table

@JmixEntity
@Table(name = "PET_OWNER")
@Entity(name = "pet_Owner")
open class Owner : Person() {
    @Column(name = "ADDRESS")
    var address: String? = null

    @Column(name = "CITY")
    var city: String? = null

    @Column(name = "EMAIL")
    var email: String? = null

    @Column(name = "TELEPHONE")
    var telephone: String? = null

    @Composition
    @OneToMany(mappedBy = "owner")
    var pets: MutableList<Pet> = mutableListOf()
}