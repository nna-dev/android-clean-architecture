package com.nna.architecture.domain.model

data class BannerItem(
    val bannerUrl: String,
    val coverUrl: String,
    val description: String,
    val encodedId: String,
    val link: String,
    val target: String,
    val title: String,
    val type: BannerType,
) {
}