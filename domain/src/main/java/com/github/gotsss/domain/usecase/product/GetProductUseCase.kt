package com.github.gotsss.domain.usecase.product

import com.github.gotsss.domain.entity.AppResult
import com.github.gotsss.domain.entity.product.ProductEntity
import com.github.gotsss.domain.repository.ProductRepository
import com.github.gotsss.domain.usecase.BaseUseCase
import javax.inject.Inject

class GetProductUseCase @Inject constructor(
    private val productRepository: ProductRepository
): BaseUseCase<Long, ProductEntity>() {

    override suspend fun execute(parameters: Long): AppResult<ProductEntity> =
        productRepository.getProduct(parameters)
}