package com.ijuba.simplerest

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ijuba.simplerest.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class UserViewModel @Inject constructor(
    private val userRepositoryImp: UserRepository
) : ViewModel() {

    fun getUser(){
        viewModelScope.launch {
            val user = userRepositoryImp.getNewUser()
            Log.e("LOG", user.toString())
        }
    }
}