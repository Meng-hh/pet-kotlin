package com.company.petkotlin.entity

import io.jmix.core.metamodel.datatype.impl.EnumClass

enum class VisitTreatmentStatus(private val id: String) : EnumClass<String> {
    UPCOMING("UPCOMING"),
    IN_PROGRESS("IN_PROGRESS"),
    DONE("DONE");

    override fun getId() = id

    companion object {

        @JvmStatic
        fun fromId(id: String): VisitTreatmentStatus? = VisitTreatmentStatus.values().find { it.id == id }
    }
}