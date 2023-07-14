package com.example.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.local.daos.GalleryDao
import com.example.data.local.entities.gallery.GalleryEntity

@Database(entities = [GalleryEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun galleryDao(): GalleryDao
}
