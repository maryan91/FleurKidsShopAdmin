package com.fleurkidsshop.admin.domain.usecase.product

import android.arch.lifecycle.LiveData
import com.fleurkidsshop.admin.domain.entity.product.Product
import com.fleurkidsshop.admin.domain.entity.product.ProductRepository
import com.fleurkidsshop.admin.domain.usecase.UseCaseWithParam

class SaveProductsUseCase(private val productRepository: ProductRepository) :
        UseCaseWithParam<LiveData<Boolean>, SaveProductsUseCase.Params> {

    data class Params(val products: List<Product>)

    override fun execute(param: Params): LiveData<Boolean> =
            productRepository.save(*param.products.toTypedArray())
}