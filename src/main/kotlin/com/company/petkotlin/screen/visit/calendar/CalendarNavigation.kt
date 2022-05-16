package com.company.petkotlin.screen.visit.calendar

import java.time.LocalDate

interface CalendarNavigation {
    fun navigate( navigationMode:CalendarNavigationMode, referenceDate: LocalDate)
}