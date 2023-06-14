package com.lyjak.anna.exercisesolid.kiss.good

import java.util.Date

object DateUtils {

    private const val MILLISECONDS_IN_HOUR: Long = 1000 * 60 * 60

    fun isPast(timestamp: Long): Boolean = timestamp < System.currentTimeMillis()

    fun isPast(date: Date): Boolean = date.time < System.currentTimeMillis()

    fun getFullDays(timestamp: Long): Long = timestamp / MILLISECONDS_IN_HOUR

    fun getFullDays(date: Date): Long = date.time / MILLISECONDS_IN_HOUR
}