/*
 * *
 *  * Created by Rafsan Ahmad on 10/11/21, 5:44 PM
 *  * Copyright (c) 2021 . All rights reserved.
 *
 */

package com.rafsan.recyclerviewpaging.ui

import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner
import com.rafsan.recyclerviewpaging.network.GithubRepository
import com.rafsan.recyclerviewpaging.ui.paging_network.PagingNetworkViewModel
import com.rafsan.recyclerviewpaging.ui.paging_network_db.PagingFromNetworkDbViewModel

/**
 * Factory for ViewModels
 */
class ViewModelFactory(
    owner: SavedStateRegistryOwner,
    private val repository: GithubRepository
) : AbstractSavedStateViewModelFactory(owner, null) {

    override fun <T : ViewModel?> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T {
        if (modelClass.isAssignableFrom(PagingNetworkViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return PagingNetworkViewModel(repository, handle) as T
        }
        if (modelClass.isAssignableFrom(PagingFromNetworkDbViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return PagingFromNetworkDbViewModel(repository, handle) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
