package com.nna.architecture.domain.model

import java.time.DayOfWeek
import java.time.LocalDateTime

data class Event(
    val encodedId: String,
    val startTime: LocalDateTime,
    val endTime: LocalDateTime,
    val label: String,
    val description: String,
    val cover: Cover
) {

}

data class Cover(
    val coverH: String,
    val coverHM: String,
    val coverS: String,
    val coverV: String,
    val coverVM: String
)