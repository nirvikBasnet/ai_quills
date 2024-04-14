package com.nirviklabs.aiquills.token

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class TokenRepository @Inject constructor(
    private val tokenDao: TokenDao
) {
    suspend fun getTokenById(id: Int): LiveData<Int> {
        return withContext(Dispatchers.IO) {
            val token = tokenDao.getToken(id)
            MutableLiveData(token.token)
        }
    }

    suspend fun insertToken(additionalToken: Int) {
        val currentToken = tokenDao.getToken(1)?.token ?: 0 // Get the current token value, default to 0 if not found
        val newToken = currentToken + additionalToken
        tokenDao.insertToken(Token(id = 1, token = newToken))
    }

    suspend fun subtractToken(subtractedToken: Int) {
        val currentToken = tokenDao.getToken(1)?.token ?: 0 // Get the current token value, default to 0 if not found
        val newToken = (currentToken - subtractedToken).coerceAtLeast(0) // Ensure the new token value doesn't go below 0
        tokenDao.insertToken(Token(id = 1, token = newToken))
    }
}

