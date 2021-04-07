package com.aaa.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private var mRetrofit: Retrofit? = null
    fun initHttpBase() {
        mRetrofit = Retrofit.Builder().baseUrl("http://doclever.cn:8090/mock/5c3c6da33dce46264b24452b/")
                .addConverterFactory(GsonConverterFactory.create())
                .callbackExecutor(Executors.newSingleThreadExecutor())
                .build();
    }
}