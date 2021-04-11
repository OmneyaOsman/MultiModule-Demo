package com.omni.home.data.repository

interface HomeRepository {

    suspend fun getHomeData()
}