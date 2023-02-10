package com.example.daggerhiltsimpleproject.data.repository

import android.app.Application
import android.util.Log
import com.example.daggerhiltsimpleproject.R
import com.example.daggerhiltsimpleproject.data.remote.MyApi
import com.example.daggerhiltsimpleproject.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyApi,
    private val appContext: Application
): MyRepository  {

    init {
        val appName = appContext.getString(R.string.app_name)
        Log.v("OUR_TAG","Our app name: $appName")
    }

    override suspend fun doNetworkCall() {

    }
}