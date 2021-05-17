package com.fleurkidsshop.admin.domain.usecase.product

import android.arch.lifecycle.LiveData
import com.fleurkidsshop.admin.domain.entity.product.Product
import com.fleurkidsshop.admin.domain.entity.product.ProductRepository
import com.fleurkidsshop.admin.domain.usecase.UseCaseWithParam

class GetProductsByIdsUseCase(private val productRepository: ProductRepository) :
        UseCaseWithParam<LiveData<List<Product>>, GetProductsByIdsUseCase.Params> {

    data class Params(val productIds: List<String>)

    override fun execute(param: Params): LiveData<List<Product>> =
            productRepository.get(*param.productIds.toTypedArray())
}