package com.nna.architecture.domain.model

data class Album(
    val encodedId: String,
    val title: String,
    val artistIds: List<String>,
    val thumbnailUrl: String,
    val thumbnailMUrl: String
)
