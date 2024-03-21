package qwqeqrqwqeqr.android.room.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.datetime.LocalDate
import qwqeqrqwqeqr.android.room.domain.model.Genre
import qwqeqrqwqeqr.android.room.database.utils.Constants.Entity.BOOK_TABLE_NAME

@Entity(tableName =  BOOK_TABLE_NAME)
data class BookEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "book_id")
    val bookId: Long = 0,

    @ColumnInfo(name = "publisher_id")
    val publisherId: Long,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "author")
    val author: String,

    @ColumnInfo(name = "publication_date")
    val publicationDate: LocalDate,

    @ColumnInfo(name ="price")
    val price: Float,

    @ColumnInfo(name ="genre")
    val genre: List<Genre>,
)