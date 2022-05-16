package com.company.petkotlin.screen.visit.calendar

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.temporal.TemporalAdjusters
import java.time.temporal.WeekFields
import java.util.*

class RelativeDates {

    companion object {

        @JvmStatic
        open fun startOfWeek(year: Int, week: Int, locale: Locale?): LocalDate? {
            val weekFields = WeekFields.of(locale)
            return LocalDateTime.now()
                .withYear(year)
                .with(weekFields.weekOfYear(), week.toLong())
                .with(weekFields.dayOfWeek(), 1)
                .toLocalDate()
        }

        @JvmStatic
        open fun startOfWeek(referencedate: LocalDate, locale: Locale): LocalDate? {
            val firstDayOfWeek: DayOfWeek = WeekFields.of(locale).firstDayOfWeek
            return referencedate.with(TemporalAdjusters.previousOrSame(firstDayOfWeek))
        }

        //todo
    }


}