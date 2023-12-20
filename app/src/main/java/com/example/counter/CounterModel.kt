package com.example.counter

class CounterModel {
    var count=0
    var isVisible=true

    fun inc(){
        count++
    }
    fun dec(){
        count--
    }
    fun clear(){
        count=0
    }
    fun changeVisibility(isVisible:Boolean){
       this.isVisible =isVisible
    }

}