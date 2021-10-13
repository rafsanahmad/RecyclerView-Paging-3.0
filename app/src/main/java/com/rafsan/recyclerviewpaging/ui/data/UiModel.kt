/*
 * *
 *  * Created by Rafsan Ahmad on 10/13/21, 6:02 PM
 *  * Copyright (c) 2021 . All rights reserved.
 *
 */

package com.rafsan.recyclerviewpaging.ui.data

import com.rafsan.recyclerviewpaging.model.Repo

sealed class UiModel {
    data class RepoItem(val repo: Repo) : UiModel()
    data class SeparatorItem(val description: String) : UiModel()
}