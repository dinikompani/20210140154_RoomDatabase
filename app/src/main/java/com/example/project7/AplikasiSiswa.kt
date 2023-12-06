package com.example.project7

import android.app.Application
import com.example.project7.repositori.ContainerApp
import com.example.project7.repositori.ContainerDataApp

class AplikasiSiswa : Application() {

    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}