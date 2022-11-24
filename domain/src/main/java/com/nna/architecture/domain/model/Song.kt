package com.nna.architecture.domain.model

data class Song(
    val id: String,
    val title: String,
    val artists: List<Artist>,

)
