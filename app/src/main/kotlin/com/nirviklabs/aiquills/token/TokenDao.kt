package com.nirviklabs.aiquills.token

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface TokenDao {
    @Query("SELECT * FROM token_table where id = :id")
    fun getToken(id: Int): Token

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertToken(token: Token)
}