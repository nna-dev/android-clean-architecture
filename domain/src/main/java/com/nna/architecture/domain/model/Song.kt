package com.nna.architecture.domain.model

data class Song(
    val id: String,
    val encodedId: String,
    val title: String,
    val artists: List<Artist>,
    val duration: Int,
    val link: String,
    val thumbnailUrl: String,
    val thumbnailMUrl: String

)
