package com.fleurkidsshop.admin.domain.usecase

interface UseCaseWithParam<out T, in P> {

    fun execute(param: P): T
}