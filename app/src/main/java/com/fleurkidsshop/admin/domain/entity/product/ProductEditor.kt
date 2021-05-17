package com.fleurkidsshop.admin.domain.entity.product

import com.fleurkidsshop.admin.domain.entity.shopOrder.ShopOrder
import java.util.*

object ProductEditor {
    fun createProduct(shopOrder: ShopOrder, name: String, amount: Int,
                      purchaseCost: Double, earn: Double, customSalePrice: Double? = null): Product {
        val deliveryCost = calculateDeliveryCost(purchaseCost, shopOrder.purchaseCost, shopOrder.deliveryCost)
        val finalCost = calculateFinalCost(purchaseCost, deliveryCost)
        return Product(
                id = UUID.randomUUID().toString(),
                shopOrderId = shopOrder.id,
                name = name,
                amount = amount,
                purchaseCost = purchaseCost,
                deliveryCost = deliveryCost,
                finalCost = finalCost,
                earn = earn,
                calculatedSalePrice = calculateSalePrice(finalCost, earn),
                customSalePrice = customSalePrice)
    }

    fun calculateDeliveryCost(purchaseCost: Double, orderPurchaseCost: Double, orderDeliveryCost: Double) =
            purchaseCost / orderPurchaseCost * orderDeliveryCost

    fun calculateFinalCost(purchaseCost: Double, deliveryCost: Double) =
            purchaseCost + deliveryCost

    fun calculateSalePrice(finalCost: Double, earn: Double) = finalCost + finalCost * earn

    fun recalculateByCurrency(product: Product, currency: Double) = Product(
            id = product.id,
            shopOrderId = product.shopOrderId,
            name = product.name,
            amount = product.amount,
            purchaseCost = product.purchaseCost.times(currency),
            deliveryCost = product.deliveryCost.times(currency),
            finalCost = product.finalCost.times(currency),
            earn = product.earn,
            calculatedSalePrice = calculateSalePrice(product.finalCost.times(currency), product.earn),
            customSalePrice = product.customSalePrice?.times(currency)
    )
}