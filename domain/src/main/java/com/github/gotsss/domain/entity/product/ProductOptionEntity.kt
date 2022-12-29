package com.github.gotsss.domain.entity.product

data class ProductOptionEntity(
    val id: Long,
    val title: String,
    val unit: String?,
    val values: List<ProductOptionValueEntity>,
)
