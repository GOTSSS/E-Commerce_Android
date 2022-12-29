package com.github.gotsss.domain.entity.product

import com.github.gotsss.domain.entity.enums.ProductMediaType

data class ProductMediaEntity(
    val id: Long,
    val url: String,
    val type: ProductMediaType,
)
