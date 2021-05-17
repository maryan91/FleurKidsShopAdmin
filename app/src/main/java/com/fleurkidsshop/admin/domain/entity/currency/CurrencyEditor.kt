package com.fleurkidsshop.admin.domain.entity.currency

import java.util.*

object CurrencyEditor {
    fun createCurrency(UAH: Double): Currency = Currency(
            id = UUID.randomUUID().toString(),
            UAH = UAH
    )
}