package com.example.marvelapi

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.qualifiers.ApplicationContext

@HiltAndroidApp
class ApplicationInitialization: Application() {
    fun provide(@ApplicationContext context: Context) {

    }


}