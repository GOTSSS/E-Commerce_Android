package com.github.gotsss.domain.entity

import com.github.gotsss.domain.entity.product.ProductBadgeEntity
import com.github.gotsss.domain.entity.product.ProductManufactureEntity
import com.github.gotsss.domain.entity.product.ProductOptionEntity

data class FilterEntity(
    val query: String,
    val manufactures: List<ProductManufactureEntity>?,
    val badges: List<ProductBadgeEntity>?,
    val options: List<ProductOptionEntity>?,
)