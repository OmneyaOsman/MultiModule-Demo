package com.omni.home.domain.repository

import com.omni.home.data.remote.HomeWebservice
import com.omni.home.data.repository.HomeRepository

class HomeRepositoryImp(private val service: HomeWebservice) : HomeRepository {
    override suspend fun getHomeData() {
        service.getHome()
    }
}