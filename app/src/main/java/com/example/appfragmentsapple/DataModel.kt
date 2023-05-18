package com.example.appfragmentsapple

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel : ViewModel() {
    val countApple: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
    val redApple: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }
    val greenApple: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }
    val statusSending: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }
}