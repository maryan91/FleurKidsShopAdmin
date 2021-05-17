package com.fleurkidsshop.admin.domain.usecase

interface UseCaseWithoutParam<out T> {

    fun execute(): T
}