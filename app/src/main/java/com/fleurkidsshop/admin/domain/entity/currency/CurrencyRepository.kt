package com.fleurkidsshop.admin.domain.entity.currency

import android.arch.lifecycle.LiveData

interface CurrencyRepository {
    fun get(): LiveData<List<Currency>>
    fun get(id: String): LiveData<Currency>
    fun save(data: Currency): LiveData<Boolean>
}