package com.example.form

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.form.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel: ViewModel(){
    var namaUSR : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    var textAlamat : String by mutableStateOf("")
        private set
    var textEmail : String by mutableStateOf("")
        private set
    var jenisStatus : String by mutableStateOf("")
        private set

    private val _uiState = MutableStateFlow(DataForm())
    val uiState :  StateFlow<DataForm> = _uiState.asStateFlow()

    fun BacaData(nm:String,tlp:String, jk:String, alm:String, em:String,st:String){
        jenisKl=jk;
        jenisStatus=st;
        textAlamat=alm;
        textEmail=em;
        namaUSR=nm;
        noTlp=tlp;
    }

    fun setJenisK(pilihJK:String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK)}}
    fun setStatus(pilihStatus:String){
        _uiState.update { currentState -> currentState.copy(status = pilihStatus)}}
}

