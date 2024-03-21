package qwqeqrqwqeqr.android.room.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import qwqeqrqwqeqr.android.room.database.entity.UserAndBookEntity


@Dao
interface UserAndBookDao {

    @Insert
    suspend fun insertUserAndBook(vararg userAndBookEntity: UserAndBookEntity)

    @Insert
    suspend fun insertUserAndBook(userAndBookEntity: UserAndBookEntity)

    @Delete(entity = UserAndBookEntity::class)
    suspend fun deleteUserAndBook(userAndBookEntity: UserAndBookEntity): Int

    @Delete(entity = UserAndBookEntity::class)
    suspend fun deleteUserAndBook(vararg userAndBookEntity: UserAndBookEntity): Int

    @Query("DELETE FROM user_and_book")
    suspend fun deleteUserAndBooks()

    @Query("SELECT * FROM user_and_book")
    fun getAllUserAndBook(): Flow<List<UserAndBookEntity>>

}