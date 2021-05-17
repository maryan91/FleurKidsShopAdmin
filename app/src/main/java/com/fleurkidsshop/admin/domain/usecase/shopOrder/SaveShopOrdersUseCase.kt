package com.fleurkidsshop.admin.domain.usecase.shopOrder

import android.arch.lifecycle.LiveData
import com.fleurkidsshop.admin.domain.entity.shopOrder.ShopOrder
import com.fleurkidsshop.admin.domain.entity.shopOrder.ShopOrderRepository

class SaveShopOrdersUseCase(private val shopOrderRepository: ShopOrderRepository) :
        UseCaseWithParam<LiveData<Boolean>, SaveShopOrdersUseCase.Params> {

    data class Params(val shopOrders: List<ShopOrder>)

    override fun execute(param: Params): LiveData<Boolean> =
            shopOrderRepository.save(*param.shopOrders.toTypedArray())
}