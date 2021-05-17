package com.fleurkidsshop.admin.domain.entity.product

import android.arch.lifecycle.LiveData

interface ProductRepository {
    fun getAll(): LiveData<List<Product>>
    fun get(vararg shopOrderId: String): LiveData<List<Product>>
    fun save(vararg data: Product):LiveData<Boolean>
}