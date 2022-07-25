package com.jeovani.appbusinesscard.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.jeovani.appbusinesscard.App
import com.jeovani.appbusinesscard.R
import com.jeovani.appbusinesscard.databinding.ActivityMainBinding
import com.jeovani.appbusinesscard.util.Image

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val mainViewModel: MainViewModel by viewModels {
        MainViewModelFactory((application as App).repository)
    }

    private val adapter by lazy { BusinessCardAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvCards.adapter = adapter
        getAllBusinessCard()
        insertListener()
    }

    private fun getAllBusinessCard() {
        mainViewModel.getAll().observe(this@MainActivity) { businessCards ->
            adapter.submitList(businessCards)
        }
    }

    private fun insertListener() {
        binding.fabNew.setOnClickListener {
            val intent = Intent(this@MainActivity, NewBusinessCard::class.java)
            startActivity(intent)
        }
        adapter.listenerShare = { card ->
            Image.share(this@MainActivity, card)
        }
    }
}