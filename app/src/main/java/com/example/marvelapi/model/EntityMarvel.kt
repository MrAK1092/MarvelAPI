package com.example.marvelapi.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "items")
data class EntityMarvel(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @ColumnInfo(name = "Name Character")
    var nameChar: String,
    @ColumnInfo(name = "Description Character")
    var descChar: String,
    @ColumnInfo(name = "Character URL")
    var charURL: String,
    @ColumnInfo(name = "Image Character")
    var imageChar: String,
    @ColumnInfo(name = "Comics Character")
    var comicsChar: String
)