package com.development.travelwondama.utils

import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object Converters {

    fun longToDateDayWithMonth(time: Long): String {
        val date = Date(time)
        val format = SimpleDateFormat(
            "dd MMM",
            Locale.getDefault()
        )

        return format.format(date)
    }

    fun longToDateFull(time: Long): String {
        val date = Date(time)
        val format = SimpleDateFormat(
            "dd MMM yyyy",
            Locale.getDefault()
        )

        return  format.format(date)
    }

    fun toRupiahFormat(number: Int): String {
        val localID = Locale("in", "ID")
        val formatter = NumberFormat.getCurrencyInstance(localID)

        return formatter.format(number)
    }
}