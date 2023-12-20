package com.example.counter

interface CounterView {
   fun showCounter(count: Int)
   fun changeVisible(visible: Boolean)
   fun showToast(message: String)
   fun changeTextColor(color: Int)
}