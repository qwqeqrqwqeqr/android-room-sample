package qwqeqrqwqeqr.android.room.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow
import qwqeqrqwqeqr.android.room.database.entity.BookEntity
import qwqeqrqwqeqr.android.room.database.entity.UserEntity
import qwqeqrqwqeqr.android.room.database.entity.UserInfoEntity
import qwqeqrqwqeqr.android.room.database.relation.UserAndUserInfo
import qwqeqrqwqeqr.android.room.database.relation.UserWithBooks
import qwqeqrqwqeqr.android.room.domain.model.Gender


@Dao
interface UserDao {

    @Insert
    suspend fun insertUser(vararg userEntity: UserEntity)

    @Insert
    suspend fun insertUser(userEntity: UserEntity): Long

    @Query("INSERT INTO user (email) values (:email) ")
    suspend fun insertUser(email: String): Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateUser(userEntity: UserEntity): Int

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateUser(vararg userEntity: UserEntity): Int

    @Upsert
    suspend fun upsertUser(userEntity: UserEntity)

    @Upsert
    suspend fun upsertUser(vararg userEntity: UserEntity)

    @Delete
    suspend fun deleteUser(userEntity: UserEntity): Int

    @Delete
    suspend fun deleteUser(vararg userEntity: UserEntity): Int

    @Query("DELETE FROM user")
    suspend fun deleteAllUsers()


    @Query("SELECT * FROM user")
    fun getAllUsers(): Flow<List<UserEntity>>

    @Query("SELECT * FROM user WHERE email=:email")
    fun getUserByEmail(email: String): Flow<List<UserEntity>>

    @Query("SELECT * FROM user")
    fun getAllUserAndUserInfo(): Flow<List<UserAndUserInfo>>

    @Transaction
    @Query("SELECT * FROM user WHERE user.user_id=:userId")
    fun getUserAndUserInfoByUserId(userId: Long): Flow<List<UserAndUserInfo>>

    @Query("SELECT * FROM user JOIN user_info on user.user_id = user_info.user_id")
    fun getAllUsersWithUserInfo(): Flow<Map<UserEntity, UserInfoEntity>>

    @Query("SELECT * FROM user JOIN user_info on user.user_id = user_info.user_id where user_info.gender=:gender")
    fun getAllUsersWithUserInfoByGender(gender: Gender): Flow<Map<UserEntity, UserInfoEntity>>

    @Transaction
    @Query("SELECT * FROM user where user.user_id =:userId")
    fun getUserAndBookByUserId(userId: Long): Flow<List<UserWithBooks>>

    @Query(
        "select * from user join " +
                "(select * from book  join user_and_book on book.book_id = user_and_book.book_id) as book " +
                " on user.user_id =book.user_id"
    )
    fun getUserWithBooks(): Flow<Map<UserEntity, List<BookEntity>>>
}