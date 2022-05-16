package com.company.petkotlin.screen.visit.calendar

import java.time.LocalDate
import java.time.temporal.TemporalUnit
import java.util.function.BiFunction

enum class CalendarNavigationMode(private val adjustmentFunction: BiFunction<TemporalUnit, LocalDate, LocalDate>) {
    PREVIOUS(
        BiFunction { unit: TemporalUnit?, referenceDate: LocalDate ->
            referenceDate.minus(
                1,
                unit
            )
        }
    ),
    NEXT(
        BiFunction { unit: TemporalUnit?, referenceDate: LocalDate ->
            referenceDate.plus(
                1,
                unit
            )
        }
    ),
    AT_DATE(
        BiFunction { unit: TemporalUnit?, referenceDate: LocalDate -> referenceDate }
    );

    fun calculate(unit: TemporalUnit, referenceDate: LocalDate): LocalDate {
        return adjustmentFunction.apply(unit, referenceDate)
    }
}
