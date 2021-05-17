package com.fleurkidsshop.admin.domain.usecase.shopOrder

import android.arch.lifecycle.LiveData
import com.fleurkidsshop.admin.domain.entity.shopOrder.ShopOrder
import com.fleurkidsshop.admin.domain.entity.shopOrder.ShopOrderRepository
import com.fleurkidsshop.admin.domain.usecase.UseCaseWithoutParam

class GetShopOrdersUseCase(private val shopOrderRepository: ShopOrderRepository) : UseCaseWithoutParam<LiveData<List<ShopOrder>>> {
    override fun execute(): LiveData<List<ShopOrder>> = shopOrderRepository.get()
}