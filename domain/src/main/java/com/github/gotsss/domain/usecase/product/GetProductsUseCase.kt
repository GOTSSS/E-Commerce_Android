package com.github.gotsss.domain.usecase.product

import com.github.gotsss.domain.base.AppResult
import com.github.gotsss.domain.base.FlowUseCase
import com.github.gotsss.domain.entity.FilterEntity
import com.github.gotsss.domain.entity.product.ProductItemEntity
import com.github.gotsss.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(
    private val productRepository: ProductRepository
): FlowUseCase<FilterEntity, List<ProductItemEntity>?>() {

    override suspend fun execute(
        parameters: FilterEntity,
        refresh: Boolean
    ): Flow<AppResult<List<ProductItemEntity>?>> = productRepository.getProducts(parameters)
}