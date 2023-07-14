package com.example.data.local.entities.gallery

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.data.mapper.DataMapper
import com.example.domain.local.GalleryLocal

@Entity(tableName = "doctour")
class GalleryEntity(
    @PrimaryKey
    val id: Long,
    val bar: String
) : DataMapper<GalleryLocal> {
    override fun mapToDomain() = GalleryLocal(id, bar)
}
