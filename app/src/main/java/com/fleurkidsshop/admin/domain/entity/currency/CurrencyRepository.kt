package com.fleurkidsshop.admin.domain.entity.currency

import android.arch.lifecycle.LiveData

interface CurrencyRepository {
    fun getAll(): LiveData<List<Currency>>
    fun get(vararg id: String): LiveData<List<Currency>>
    fun save(vararg data: Currency): LiveData<Boolean>
}