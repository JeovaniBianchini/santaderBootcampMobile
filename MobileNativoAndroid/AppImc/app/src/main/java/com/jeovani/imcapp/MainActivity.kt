package com.jeovani.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import com.jeovani.imcapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }

    private fun setListeners() {
        binding.etHeight?.doOnTextChanged{ text, _, _, _ ->
            binding.tvTitle.text = text
        }
        binding.etWeight?.doOnTextChanged { text, _, _, _ ->
            binding.tvTitle.text = text
        }
        binding.btCalculate.setOnClickListener{
            calcularImc(binding.etWeight.text.toString(), binding.etHeight.text.toString())
        }

    }

    private fun calcularImc(weight: String, height: String) {
        val weight = weight.toFloatOrNull()
        val height = height.toFloatOrNull()

        if(weight != null && height != null){
            val imc = weight / (height * height)
            binding.tvTitle.text = "Seu IMC é: \n %.2f".format(imc)
        }
    }


}