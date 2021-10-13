/*
 * *
 *  * Created by Rafsan Ahmad on 10/12/21, 1:07 AM
 *  * Copyright (c) 2021 . All rights reserved.
 *
 */

package com.rafsan.recyclerviewpaging.ui.data

import androidx.paging.PagingData
import com.rafsan.recyclerviewpaging.utils.DEFAULT_QUERY

data class UiState(
    val query: String = DEFAULT_QUERY,
    val lastQueryScrolled: String = DEFAULT_QUERY,
    val hasNotScrolledForCurrentSearch: Boolean = false,
    val pagingData: PagingData<UiModel> = PagingData.empty()
)