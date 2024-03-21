package qwqeqrqwqeqr.android.room.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import qwqeqrqwqeqr.android.room.database.utils.Constants.Entity.USER_AND_BOOK_TABLE_NAME


@Entity(
    tableName = USER_AND_BOOK_TABLE_NAME,
    primaryKeys = ["user_id", "book_id"]
)
data class UserAndBookEntity(

    @ColumnInfo(name = "user_id")
    var userId: Long,

    @ColumnInfo(name = "book_id")
    var bookId: Long,
)

