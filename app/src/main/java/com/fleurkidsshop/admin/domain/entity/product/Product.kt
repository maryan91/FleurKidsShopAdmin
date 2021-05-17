package com.fleurkidsshop.admin.domain.entity.product

data class Product(val id:String, // unique product id (primary key)
                   val shopOrderId: String, // unique shopOrder id (foreign key)
                   val name: String, // name of the product
                   val amount: Int, // count of items inside the product
                   val purchaseCost: Double, // original cost of product
                   val deliveryCost: Double, // purchaseCost / order.purchaseCost * order.deliveryCost
                   val finalCost: Double, // purchaseCost + deliveryCost
                   val earn: Double, // 10% = 0.1, 45.5% = 0.455, 100% = 1...
                   val calculatedSalePrice: Double, // finalCost + finalCost * earn
                   val customSalePrice: Double? // price defined by administrator, usually this is rounded calculatedSalePrice
)
