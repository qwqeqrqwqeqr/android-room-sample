package qwqeqrqwqeqr.android.room.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import qwqeqrqwqeqr.android.room.database.entity.UserInfoEntity
import qwqeqrqwqeqr.android.room.database.utils.Constants.Entity.USER_INFO_TABLE_NAME


@Dao
interface UserInfoDao {
    @Query("SELECT * FROM $USER_INFO_TABLE_NAME")
    fun getAllUserInfos(): Flow<List<UserInfoEntity>>

    @Insert
    suspend fun insertUserInfo(vararg userInfoEntity: UserInfoEntity)

    @Insert
    suspend fun insertUserInfo(userInfoEntity: UserInfoEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateUserInfo(userInfoEntity: UserInfoEntity): Int

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateUserInfo(vararg userInfoEntity: UserInfoEntity): Int


    @Delete(entity = UserInfoEntity::class)
    suspend fun deleteUserInfo(userInfoEntity: UserInfoEntity): Int

    @Delete(entity = UserInfoEntity::class)
    suspend fun deleteUserInfo(vararg userInfoEntity: UserInfoEntity): Int

    @Query("DELETE FROM user_info")
    suspend fun deleteAllUserInfos()
}