package com.example.stringviewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class StringViewModel(val text: String) : ViewModel() {

    var liveData = MutableLiveData<String>()

    fun getLiveData(): String {
        liveData.value = text
        return liveData.value!!
        Log.d("AAA", "liveData : ${liveData.value}")
    }
}
