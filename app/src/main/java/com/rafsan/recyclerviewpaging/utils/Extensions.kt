/*
 * *
 *  * Created by Rafsan Ahmad on 10/11/21, 6:06 PM
 *  * Copyright (c) 2021 . All rights reserved.
 *
 */

package com.rafsan.recyclerviewpaging.utils

import android.view.View
import com.rafsan.recyclerviewpaging.ui.data.UiModel

fun View.isVisible() = this.visibility == View.VISIBLE
val UiModel.RepoItem.roundedStarCount: Int
    get() = this.repo.stars / 5_000