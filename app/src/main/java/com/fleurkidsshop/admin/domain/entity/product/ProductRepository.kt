package com.fleurkidsshop.admin.domain.entity.product

import android.arch.lifecycle.LiveData

interface ProductRepository {
    fun get(): LiveData<List<Product>>
    fun get(shopOrderId: String): LiveData<List<Product>>
    fun save(data: Product):LiveData<Boolean>
}