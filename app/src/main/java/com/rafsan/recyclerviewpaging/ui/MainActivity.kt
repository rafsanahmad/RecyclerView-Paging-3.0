/*
 * *
 *  * Created by Rafsan Ahmad on 10/14/21, 2:35 AM
 *  * Copyright (c) 2021 . All rights reserved.
 *
 */

package com.rafsan.recyclerviewpaging.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rafsan.recyclerviewpaging.databinding.ActivityMainBinding
import com.rafsan.recyclerviewpaging.utils.PAGING_TYPE_NETWORK
import com.rafsan.recyclerviewpaging.utils.PAGING_TYPE_NETWORK_DB

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupListener()
    }

    private fun setupListener() {
        binding.pagingFromNetwork.setOnClickListener {
            val intent = Intent(this@MainActivity, SearchRepositoriesActivity::class.java)
            intent.putExtra("paging", PAGING_TYPE_NETWORK)
            startActivity(intent)
        }
        binding.pagingFromNetworkAndDb.setOnClickListener {
            val intent = Intent(this@MainActivity, SearchRepositoriesActivity::class.java)
            intent.putExtra("paging", PAGING_TYPE_NETWORK_DB)
            startActivity(intent)
        }
    }
}