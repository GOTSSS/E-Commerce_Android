package com.github.gotsss.domain.entity.product

data class ProductOptionValueEntity(
    val id: Long,
    val value: String,
    val iconUrl: String?,
    val colorCode: String?,
)
