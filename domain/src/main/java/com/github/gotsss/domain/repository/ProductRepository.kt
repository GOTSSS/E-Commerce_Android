package com.github.gotsss.domain.repository

import com.github.gotsss.domain.base.AppResult
import com.github.gotsss.domain.entity.FilterEntity
import com.github.gotsss.domain.entity.product.ProductEntity
import com.github.gotsss.domain.entity.product.ProductItemEntity
import kotlinx.coroutines.flow.Flow

interface ProductRepository {

    suspend fun getProducts(filter: FilterEntity): Flow<AppResult<List<ProductItemEntity>?>>

    suspend fun getProduct(id: Long): Flow<AppResult<ProductEntity>>

}