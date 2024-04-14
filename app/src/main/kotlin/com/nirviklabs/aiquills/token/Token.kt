package com.nirviklabs.aiquills.token

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "token_table")
data class Token(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "token") val token: Int = 10,
)