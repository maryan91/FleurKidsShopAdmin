package com.fleurkidsshop.admin.domain.entity.shopOrder

import android.arch.lifecycle.LiveData

interface ShopOrderRepository {
    fun get(): LiveData<List<ShopOrder>>
    fun get(shopOrderId: String): LiveData<ShopOrder>
    fun save(data: ShopOrder):LiveData<Boolean>
}