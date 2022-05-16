package com.company.petkotlin.screen.visit.calendar

import io.jmix.ui.component.Calendar
import io.jmix.ui.component.DatePicker
import io.jmix.ui.component.Label
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime


class CalendarScreenAdjustment private constructor(
    private val calendar: Calendar<LocalDateTime>,
    private val calendarNavigator: DatePicker<LocalDate>,
    private val calendarTitle: Label<String>
) {
    fun adjust(calendarStart: LocalDate, calendarEnd: LocalDate, navigatorDate: LocalDate?, title: String?) {
        calendar.startDate = calendarStart.atStartOfDay()
        calendar.endDate = calendarEnd.atTime(LocalTime.MAX)
        calendarNavigator.value = navigatorDate
        calendarTitle.value = title
    }

    companion object {
        fun of(
            calendar: Calendar<LocalDateTime>,
            calendarNavigator: DatePicker<LocalDate>,
            calendarTitle: Label<String>
        ): CalendarScreenAdjustment {
            return CalendarScreenAdjustment(calendar, calendarNavigator, calendarTitle)
        }
    }
}