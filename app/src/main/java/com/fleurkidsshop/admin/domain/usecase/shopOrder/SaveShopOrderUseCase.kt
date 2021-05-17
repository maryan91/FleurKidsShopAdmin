package com.fleurkidsshop.admin.domain.usecase.shopOrder

import android.arch.lifecycle.LiveData
import com.fleurkidsshop.admin.domain.entity.shopOrder.ShopOrder
import com.fleurkidsshop.admin.domain.entity.shopOrder.ShopOrderRepository
import com.fleurkidsshop.admin.domain.usecase.UseCaseWithParam

class SaveShopOrderUseCase(private val shopOrderRepository: ShopOrderRepository) : UseCaseWithParam<LiveData<Boolean>, SaveShopOrderUseCase.Params> {

    data class Params(val shopOrder: ShopOrder)

    override fun execute(param: Params): LiveData<Boolean> = shopOrderRepository.save(param.shopOrder)
}