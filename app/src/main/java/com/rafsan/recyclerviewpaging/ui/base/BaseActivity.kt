/*
 * *
 *  * Created by Rafsan Ahmad on 2/15/23, 7:11 PM
 *  * Copyright (c) 2023 . All rights reserved.
 *
 */

package com.rafsan.recyclerviewpaging.ui.base

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.rafsan.recyclerviewpaging.R

abstract class BaseActivity : AppCompatActivity() {

    abstract fun getToolbarTitle(): String

    override fun onStart() {
        super.onStart()
        setToolbarTitle(getToolbarTitle())
        getUpButton().setOnClickListener {
            finish()
        }
    }

    private fun getUpButton(): ImageView = findViewById(R.id.btnToolbarBack)
    private fun getToolbar(): TextView = findViewById(R.id.toolbarTitle)

    fun hideUpButton() {
        getUpButton().visibility = View.GONE
    }

    private fun setToolbarTitle(toolbarTitle: String) {
        getToolbar().text = toolbarTitle
    }
}