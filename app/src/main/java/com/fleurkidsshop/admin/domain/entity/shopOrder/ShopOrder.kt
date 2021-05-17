package com.fleurkidsshop.admin.domain.entity.shopOrder

data class ShopOrder(val id: String,
                     val date: String,
                     val purchaseCost: Double,
                     val deliveryCost: Double,
                     val finalCost: Double,
                     val currencyId: String
)
