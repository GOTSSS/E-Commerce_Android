package com.github.gotsss.domain.usecase.product

import com.github.gotsss.domain.base.AppResult
import com.github.gotsss.domain.base.FlowUseCase
import com.github.gotsss.domain.entity.product.ProductEntity
import com.github.gotsss.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetProductUseCase @Inject constructor(
    private val productRepository: ProductRepository
): FlowUseCase<Long, ProductEntity>() {
    override suspend fun execute(
        parameters: Long,
        refresh: Boolean
    ): Flow<AppResult<ProductEntity>> = productRepository.getProduct(parameters)
}