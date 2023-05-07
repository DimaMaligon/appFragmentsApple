package com.example.appfragmentsapple

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel : ViewModel() {
    val countApples: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
    val redApples: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }
    val greenApples: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }
    val statusSending: MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }
}