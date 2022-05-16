package com.company.petkotlin.entity

import io.jmix.core.metamodel.datatype.impl.EnumClass

enum class CalendarMode(private val id: String) : EnumClass<String> {
    DAY("DAY"),
    WEEK("WEEK"),
    MONTH("MONTH");

    override fun getId() = id

    companion object {

        @JvmStatic
        fun fromId(id: String): CalendarMode? = CalendarMode.values().find { it.id == id }
    }
}