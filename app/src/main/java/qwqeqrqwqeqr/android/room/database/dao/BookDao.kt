package qwqeqrqwqeqr.android.room.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import qwqeqrqwqeqr.android.room.database.entity.BookEntity
import qwqeqrqwqeqr.android.room.database.relation.BookWithUsers


@Dao
interface BookDao {

    @Insert
    suspend fun insertBook(vararg bookEntity: BookEntity)

    @Insert
    suspend fun insertBook(bookEntity: BookEntity)

    @Update(entity = BookEntity::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateBook(bookEntity: BookEntity): Int

    @Update(entity = BookEntity::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateBook(vararg bookEntity: BookEntity): Int


    @Delete(entity = BookEntity::class)
    suspend fun deleteBook(bookEntity: BookEntity): Int

    @Delete(entity = BookEntity::class)
    suspend fun deleteBook(vararg bookEntity: BookEntity): Int

    @Query("DELETE FROM book")
    suspend fun deleteAllBooks()

    @Query("SELECT * FROM book")
    fun getAllBooks(): Flow<List<BookEntity>>

    @Transaction
    @Query("SELECT * FROM book where book.book_id=:bookId")
    fun getUserAndBookByBookId(bookId: Long): Flow<List<BookWithUsers>>

}