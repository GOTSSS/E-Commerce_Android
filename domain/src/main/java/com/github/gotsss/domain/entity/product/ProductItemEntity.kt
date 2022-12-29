package com.github.gotsss.domain.entity.product

data class ProductItemEntity(
    val id: Long,
    val officialMedias: List<ProductMediaEntity>,
    val title: String,
    val manufacture: ProductManufactureEntity?,
    val productOptions: List<ProductOptionEntity>?,
    val productRate: ProductRateEntity?,
    val productBadges: List<ProductBadgeEntity>?,
    val productPrice: ProductPriceEntity,
    )
