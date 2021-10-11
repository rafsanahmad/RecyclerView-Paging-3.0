/*
 * *
 *  * Created by Rafsan Ahmad on 10/11/21, 5:44 PM
 *  * Copyright (c) 2021 . All rights reserved.
 *
 */

package com.rafsan.recyclerviewpaging.model

/**
 * RepoSearchResult from a search, which contains List<Repo> holding query data,
 * and a String of network error state.
 */
sealed class RepoSearchResult {
    data class Success(val data: List<Repo>) : RepoSearchResult()
    data class Error(val error: Exception) : RepoSearchResult()
}
