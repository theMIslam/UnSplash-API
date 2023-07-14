package com.example.data.local.db

import android.content.Context
import androidx.room.Room
import com.example.data.local.daos.GalleryDao


class RoomClient {
    fun provideAppDatabase(context: Context) = Room
        .databaseBuilder(context, AppDatabase::class.java, "gallery.db")
        .build()

    fun provideGalleryDao(appDatabase: AppDatabase): GalleryDao = appDatabase.galleryDao()
}
