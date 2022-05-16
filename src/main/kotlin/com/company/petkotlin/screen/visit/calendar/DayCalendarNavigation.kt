package com.company.petkotlin.screen.visit.calendar

import io.jmix.core.metamodel.datatype.DatatypeFormatter
import java.time.LocalDate
import java.time.temporal.ChronoUnit

class DayCalendarNavigation constructor(
    private val datatypeFormatter: DatatypeFormatter,
    private val screenAdjustment: CalendarScreenAdjustment
) :CalendarNavigation{

    override fun navigate(navigationMode: CalendarNavigationMode, referenceDate: LocalDate) {
        var newDate :LocalDate = navigationMode.calculate(ChronoUnit.DAYS,referenceDate)
        screenAdjustment.adjust(
            newDate,
            newDate,
            newDate,
            datatypeFormatter.formatLocalDate(newDate)
        )

    }
}