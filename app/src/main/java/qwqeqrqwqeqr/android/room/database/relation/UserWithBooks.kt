package qwqeqrqwqeqr.android.room.database.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import qwqeqrqwqeqr.android.room.database.entity.BookEntity
import qwqeqrqwqeqr.android.room.database.entity.UserAndBookEntity
import qwqeqrqwqeqr.android.room.database.entity.UserEntity

data class UserWithBooks(
    @Embedded val userEntity: UserEntity,
    @Relation(
        parentColumn = "user_id",
        entityColumn = "book_id",
        associateBy = Junction(
            value = UserAndBookEntity::class,
            parentColumn = "user_id",
            entityColumn = "book_id"
        )
    )
    val bookEntity: List<BookEntity>,
)



