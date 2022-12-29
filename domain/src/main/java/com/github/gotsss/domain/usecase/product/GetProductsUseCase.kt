package com.github.gotsss.domain.usecase.product

import com.github.gotsss.domain.entity.AppResult
import com.github.gotsss.domain.entity.FilterEntity
import com.github.gotsss.domain.entity.product.ProductItemEntity
import com.github.gotsss.domain.repository.ProductRepository
import com.github.gotsss.domain.usecase.BaseUseCase
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(
    private val productRepository: ProductRepository
): BaseUseCase<FilterEntity, List<ProductItemEntity>?>() {

    override suspend fun execute(parameters: FilterEntity): AppResult<List<ProductItemEntity>?> =
        productRepository.getProducts(parameters)
}