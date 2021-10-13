/*
 * *
 *  * Created by Rafsan Ahmad on 10/13/21, 10:01 PM
 *  * Copyright (c) 2021 . All rights reserved.
 *
 */

package com.rafsan.recyclerviewpaging.data

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import com.rafsan.recyclerviewpaging.api.GithubService
import com.rafsan.recyclerviewpaging.db.RepoDatabase
import com.rafsan.recyclerviewpaging.model.Repo

@OptIn(ExperimentalPagingApi::class)
class GithubRemoteMediator(
    private val query: String,
    private val service: GithubService,
    private val repoDatabase: RepoDatabase
) : RemoteMediator<Int, Repo>() {

    override suspend fun load(loadType: LoadType, state: PagingState<Int, Repo>): MediatorResult {

    }
}