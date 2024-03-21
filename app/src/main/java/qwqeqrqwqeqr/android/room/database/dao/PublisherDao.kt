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
import qwqeqrqwqeqr.android.room.database.entity.PublisherEntity
import qwqeqrqwqeqr.android.room.database.relation.PublisherAndBooks


@Dao
interface PublisherDao {
    @Insert
    suspend fun insertPublisher(vararg publisherEntity: PublisherEntity)

    @Insert
    suspend fun insertPublisher(publisherEntity: PublisherEntity)

    @Update(entity = PublisherEntity::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun updatePublisher(publisherEntity: PublisherEntity): Int

    @Update(entity = PublisherEntity::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun updatePublisher(vararg publisherEntity: PublisherEntity): Int


    @Delete(entity = PublisherEntity::class)
    suspend fun deletePublisher(publisherEntity: PublisherEntity): Int

    @Delete(entity = PublisherEntity::class)
    suspend fun deletePublisher(vararg publisherEntity: PublisherEntity): Int

    @Query("DELETE FROM publisher")
    suspend fun deleteAllUserInfos()

    @Query("SELECT * FROM publisher")
    fun getAllPublishers(): Flow<List<PublisherEntity>>

    @Query("SELECT * FROM publisher join book on publisher.id = book.publisher_id")
    fun getAllPublisherWithBooks(): Flow<Map<PublisherEntity, List<BookEntity>>>

    @Transaction
    @Query("SELECT * FROM publisher")
    fun getPublisherAndBooks(): Flow<List<PublisherAndBooks>>

    @Transaction
    @Query("SELECT * FROM publisher WHERE publisher.id=:publisherId")
    fun getPublisherAndBooksByPublisherId(publisherId: Long): Flow<List<PublisherAndBooks>>

}