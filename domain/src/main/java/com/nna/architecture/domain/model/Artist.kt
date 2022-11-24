package com.nna.architecture.domain.model

open class Artist(
    val id: String,
    val name: String,
    val link: String,
    val cover: String,
    val thumbnail: String,
    val spotlight: Boolean,
    val follow: Int = 0,
    val playlistId: String
) {
}