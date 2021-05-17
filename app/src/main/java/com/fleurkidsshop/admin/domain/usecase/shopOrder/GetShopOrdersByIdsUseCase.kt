package com.fleurkidsshop.admin.domain.usecase.shopOrder

import android.arch.lifecycle.LiveData
import com.fleurkidsshop.admin.domain.entity.shopOrder.ShopOrder
import com.fleurkidsshop.admin.domain.entity.shopOrder.ShopOrderRepository

class GetShopOrdersByIdsUseCase(private val shopOrderRepository: ShopOrderRepository) :
        UseCaseWithParam<LiveData<List<ShopOrder>>, GetShopOrdersByIdsUseCase.Params> {

    data class Params(val shopOrderIds: List<String>)

    override fun execute(param: Params): LiveData<List<ShopOrder>> =
            shopOrderRepository.get(*param.shopOrderIds.toTypedArray())
}