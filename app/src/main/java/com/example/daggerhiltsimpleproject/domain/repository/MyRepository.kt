package com.example.daggerhiltsimpleproject.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}