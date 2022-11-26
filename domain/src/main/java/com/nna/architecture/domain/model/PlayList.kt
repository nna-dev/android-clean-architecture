package com.nna.architecture.domain.model

data class PlayList(
    val encodedId: String,
    val title: String,
    val thumbnailUrl: String,
    val thumbnailMUrl: String,
    val artist: List<Artist>,
    val link: String
) {
}