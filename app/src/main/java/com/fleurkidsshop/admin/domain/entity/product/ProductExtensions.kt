package com.fleurkidsshop.admin.domain.entity.product

fun Product.convertByCurrency(currency: Double): Product {
    return Product(
            id = this.id,
            shopOrderId = this.shopOrderId,
            name = this.name,
            amount = this.amount,
            purchaseCost = this.purchaseCost.times(currency),
            deliveryCost = this.deliveryCost.times(currency),
            finalCost = this.finalCost.times(currency),
            earn = this.earn,
            calculatedSalePrice = this.calculatedSalePrice.times(currency),
            customSalePrice = this.customSalePrice?.times(currency)
    )
}