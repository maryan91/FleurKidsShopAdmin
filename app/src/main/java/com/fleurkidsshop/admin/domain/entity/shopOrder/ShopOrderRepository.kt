package com.fleurkidsshop.admin.domain.entity.shopOrder

import android.arch.lifecycle.LiveData

interface ShopOrderRepository {
    fun getAll(): LiveData<List<ShopOrder>>
    fun get(vararg shopOrderId: String): LiveData<List<ShopOrder>>
    fun save(vararg data: ShopOrder):LiveData<Boolean>
}