package com.fleurkidsshop.admin.domain.entity.shopOrder

import java.util.*

object ShopOrderEditor {
    fun createShopOrder(date: String, purchaseCost: Double, deliveryCost: Double, currencyId: String): ShopOrder {
        return ShopOrder(
                id = UUID.randomUUID().toString(),
                date = date,
                purchaseCost = purchaseCost,
                deliveryCost = deliveryCost,
                finalCost = calculateFinalCost(purchaseCost, deliveryCost),
                currencyId = currencyId
        )
    }

    fun calculateFinalCost(purchaseCost: Double, deliveryCost: Double): Double {
        return purchaseCost + deliveryCost
    }
}