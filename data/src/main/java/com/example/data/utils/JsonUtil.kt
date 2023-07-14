package com.example.data.utils

import android.content.Context
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory


private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

internal inline fun <reified T> fromJson(value: String): T? {
    return moshi.adapter(T::class.java).fromJson(value)
}

internal inline fun <reified T> toJson(generic: T?): String {
    return moshi.adapter(T::class.java).toJson(generic)
}

internal fun Context.jsonFromAssets(fileName: String): String {
    return this.assets.open(fileName).bufferedReader().use { it.readText() }
}
