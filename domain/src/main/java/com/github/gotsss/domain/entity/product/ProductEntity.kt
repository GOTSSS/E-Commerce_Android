package com.github.gotsss.domain.entity.product

data class ProductEntity(
    val id: Long,
    val officialMedias: List<ProductMediaEntity>,
    val userMedias: List<ProductMediaEntity>?,
    val title: String,
    val manufacture: ProductManufactureEntity?,
    val productOptions: List<ProductOptionEntity>?,
    val productRate: ProductRateEntity?,
    val productComments: List<ProductCommentEntity>?,
    val productBadges: List<ProductBadgeEntity>?,
    val productPrice: ProductPriceEntity,
    )
