package qwqeqrqwqeqr.android.room.database.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import qwqeqrqwqeqr.android.room.database.entity.BookEntity
import qwqeqrqwqeqr.android.room.database.entity.UserAndBookEntity
import qwqeqrqwqeqr.android.room.database.entity.UserEntity


data class BookWithUsers(
    @Embedded val bookEntity: BookEntity,
    @Relation(
        parentColumn = "book_id",
        entityColumn = "user_id",
        associateBy = Junction(UserAndBookEntity::class)
    )
    val userEntity: List<UserEntity>,
)