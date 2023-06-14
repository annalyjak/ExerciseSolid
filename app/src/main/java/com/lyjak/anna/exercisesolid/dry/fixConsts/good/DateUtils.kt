package com.lyjak.anna.exercisesolid.dry.fixConsts.good

class DateUtils {

    val CONS = 1000 * 60 * 60 * 24

    fun getDaysInMiliseconds(miliseconds: Long): Long {
        return miliseconds / CONS
    }

    fun getMilisecondsInDays(days: Long): Long {
        return days * CONS
    }
}