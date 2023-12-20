package com.example.counter

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.counter.databinding.ActivityMainBinding
import kotlin.math.max

class MainActivity : AppCompatActivity(), CounterView {

    lateinit var binding: ActivityMainBinding
    private val presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            btnPlus.setOnClickListener {
                presenter.increment()
                presenter.processNumber()
            }
            btnMinus.setOnClickListener {
                presenter.decrement()
            }
            btnClear.setOnClickListener {
                presenter.clear()
            }
            changeVisible.setOnClickListener {
                presenter.changeVisible()
            }
        }
    }


    override fun showCounter(count: Int) {
        binding.textV.text = count.toString()
    }

    override fun changeVisible(visible: Boolean) {
        binding.textV.isVisible = visible
    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun changeTextColor(color: Int) {
      binding.textV.setTextColor(color)
    }

}