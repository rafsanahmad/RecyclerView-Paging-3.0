/*
 * *
 *  * Created by Rafsan Ahmad on 10/13/21, 10:13 PM
 *  * Copyright (c) 2021 . All rights reserved.
 *
 */

package com.rafsan.recyclerviewpaging.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "remote_keys")
data class RemoteKeys(
    @PrimaryKey
    val repoId: Long,
    val prevKey: Int?,
    val nextKey: Int?
)