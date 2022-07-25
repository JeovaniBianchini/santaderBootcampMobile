package com.jeovani.appbusinesscard.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.jeovani.appbusinesscard.App
import com.jeovani.appbusinesscard.R
import com.jeovani.appbusinesscard.data.BusinessCard
import com.jeovani.appbusinesscard.databinding.ActivityNewBusinessCardBinding

class NewBusinessCard : AppCompatActivity() {
    private val binding by lazy { ActivityNewBusinessCardBinding.inflate(layoutInflater) }

    private val mainViewModel: MainViewModel by viewModels {
        MainViewModelFactory((application as App).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListener()

    }

    private fun insertListener() {
        binding.btClose.setOnClickListener {
            finish()
        }
        binding.btConfirm.setOnClickListener {
            val businessCard = BusinessCard(
                name = binding.etName.editText?.text.toString(),
                phone = binding.etPhone.editText?.text.toString(),
                email = binding.etEmail.editText?.text.toString(),
                company = binding.etCompany.editText?.text.toString(),
                color = binding.etColor.editText?.text.toString()
            )
            mainViewModel.insert(businessCard)
            Toast.makeText(this, R.string.label_show_success, Toast.LENGTH_SHORT).show()
            finish()
        }


    }
}