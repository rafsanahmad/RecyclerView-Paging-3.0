/*
 * *
 *  * Created by Rafsan Ahmad on 10/11/21, 5:44 PM
 *  * Copyright (c) 2021 . All rights reserved.
 *
 */

package com.rafsan.recyclerviewpaging

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import androidx.savedstate.SavedStateRegistryOwner
import com.rafsan.recyclerviewpaging.api.GithubService
import com.rafsan.recyclerviewpaging.db.RepoDatabase
import com.rafsan.recyclerviewpaging.network.GithubRepository
import com.rafsan.recyclerviewpaging.ui.ViewModelFactory

/**
 * Class that handles object creation.
 * Like this, objects can be passed as parameters in the constructors and then replaced for
 * testing, where needed.
 */
object Injection {

    private fun provideGithubRepository(context: Context): GithubRepository {
        return GithubRepository(GithubService.create(), RepoDatabase.getInstance(context))
    }

    fun provideViewModelFactory(context: Context, owner: SavedStateRegistryOwner): ViewModelProvider.Factory {
        return ViewModelFactory(owner, provideGithubRepository(context))
    }
}
