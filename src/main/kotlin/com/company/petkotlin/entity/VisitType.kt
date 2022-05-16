package com.company.petkotlin.entity

import io.jmix.core.metamodel.datatype.impl.EnumClass

enum class VisitType(private val id: String,private val styleName:String,private val icon:String) : EnumClass<String> {

    REGULAR_CHECKUP("REGULAR_CHECKUP", "event-blue", "BLUE"),
    RECHARGE("RECHARGE", "event-green", "GREEN"),
    STATUS_CONDITION_HEALING("STATUS_CONDITION_HEALING", "event-yellow", "YELLOW"),
    DISEASE_TREATMENT("DISEASE_TREATMENT", "event-red", "RED"),
    OTHER("OTHER", "event-purple", "PURPLE");

    override fun getId() = id


    companion object {

        @JvmStatic
        fun fromId(id: String): VisitType? = VisitType.values().find { it.id == id }
    }
}