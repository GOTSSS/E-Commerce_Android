package com.github.gotsss.domain.repository

import com.github.gotsss.domain.entity.AppResult
import com.github.gotsss.domain.entity.FilterEntity
import com.github.gotsss.domain.entity.product.ProductEntity
import com.github.gotsss.domain.entity.product.ProductItemEntity

interface ProductRepository {

    suspend fun getProducts(filter: FilterEntity): AppResult<List<ProductItemEntity>?>

    suspend fun getProduct(id: Long): AppResult<ProductEntity>

}