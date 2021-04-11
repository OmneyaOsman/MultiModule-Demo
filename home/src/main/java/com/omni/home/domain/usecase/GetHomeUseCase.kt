package com.omni.home.domain.usecase

import com.omni.home.data.repository.HomeRepository

class GetHomeUseCase(private val repository: HomeRepository) {
   suspend  operator fun invoke() = repository.getHomeData()
}