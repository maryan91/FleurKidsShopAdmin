package com.fleurkidsshop.admin.domain.usecase.product

import android.arch.lifecycle.LiveData
import com.fleurkidsshop.admin.domain.entity.product.Product
import com.fleurkidsshop.admin.domain.entity.product.ProductRepository
import com.fleurkidsshop.admin.domain.usecase.UseCaseWithoutParam

class GetProductsUseCase(private val productRepository: ProductRepository) :
        UseCaseWithoutParam<LiveData<List<Product>>> {
    override fun execute(): LiveData<List<Product>> = productRepository.get()
}