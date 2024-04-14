package com.nirviklabs.aiquills.token

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TokenViewModel @Inject constructor(
    private val tokenRepository: TokenRepository
) : ViewModel() {

    private val _token = MutableLiveData<Int>()
    val token: LiveData<Int> = _token

    fun fetchToken() {
        viewModelScope.launch {
            val tokenValue = tokenRepository.getTokenById(1).value
            _token.value = tokenValue!!
        }
    }

    // Function to insert token
    fun insertToken(token: Int) = viewModelScope.launch(Dispatchers.IO) {
        tokenRepository.insertToken(token)
        fetchToken()
    }

    fun subtractToken(token: Int) = viewModelScope.launch(Dispatchers.IO) {
        tokenRepository.subtractToken(token)
    }
}
