package com.example.counter

import android.graphics.Color

class Presenter {
    private var model = CounterModel()
    private lateinit var view: CounterView

    fun increment() {
        model.inc()
        view.showCounter(model.count)
    }
    fun processNumber() {
        when {
            model.count == 10 -> {
                view.showToast("Поздравляем")
                view.showCounter(model.count)
            }
            model.count == 15 -> {
                view.changeTextColor(Color.GREEN)
                view.showCounter(model.count)

            }

        }

    }

    fun decrement() {
        model.dec()
        view.showCounter(model.count)
    }

    fun clear() {
        model.clear()
        view.showCounter(model.count)
    }

    fun changeVisible() {
        if (model.isVisible) {
            model.changeVisibility(false)
        } else {
            model.changeVisibility(true)
        }
        view.changeVisible(model.isVisible)
    }
    fun attachView(view1: CounterView) {
        this.view = view1
    }


}