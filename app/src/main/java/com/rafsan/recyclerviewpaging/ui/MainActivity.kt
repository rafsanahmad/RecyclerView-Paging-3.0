/*
 * *
 *  * Created by Rafsan Ahmad on 10/14/21, 2:35 AM
 *  * Copyright (c) 2021 . All rights reserved.
 *
 */

package com.rafsan.recyclerviewpaging.ui

import android.content.Intent
import android.os.Bundle
import com.rafsan.recyclerviewpaging.databinding.ActivityMainBinding
import com.rafsan.recyclerviewpaging.ui.base.BaseActivity
import com.rafsan.recyclerviewpaging.ui.paging_network.PagingFromNetworkActivity
import com.rafsan.recyclerviewpaging.ui.paging_network_db.PagingFromNetworkDbActivity

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun getToolbarTitle() = "Paging 3"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        hideUpButton()
        setupListener()
    }

    private fun setupListener() {
        binding.pagingFromNetwork.setOnClickListener {
            val intent = Intent(this@MainActivity, PagingFromNetworkActivity::class.java)
            startActivity(intent)
        }

        binding.pagingFromNetworkAndDb.setOnClickListener {
            val intent = Intent(this@MainActivity, PagingFromNetworkDbActivity::class.java)
            startActivity(intent)
        }
    }
}