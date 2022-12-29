package com.github.gotsss.domain.entity.product

data class ProductCommentEntity(
    val id: Long,
    val title: String,
    val productMedias: List<ProductMediaEntity>?,
    val description: String?,
)
