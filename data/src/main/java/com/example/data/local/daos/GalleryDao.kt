package com.example.data.local.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.local.entities.gallery.GalleryEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface GalleryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGallery(foo: GalleryEntity)

    @Query("SELECT * FROM doctour")
    fun getAllGallery(): Flow<List<GalleryEntity>>
}
