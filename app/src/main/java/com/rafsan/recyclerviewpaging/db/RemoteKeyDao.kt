/*
 * *
 *  * Created by Rafsan Ahmad on 10/13/21, 10:14 PM
 *  * Copyright (c) 2021 . All rights reserved.
 *
 */

package com.rafsan.recyclerviewpaging.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RemoteKeysDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(remoteKey: List<RemoteKeys>)

    @Query("SELECT * FROM remote_keys WHERE repoId = :repoId")
    suspend fun remoteKeysRepoId(repoId: Long): RemoteKeys?

    @Query("DELETE FROM remote_keys")
    suspend fun clearRemoteKeys()
}