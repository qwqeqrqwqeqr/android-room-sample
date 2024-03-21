package qwqeqrqwqeqr.android.room.database.relation

import androidx.room.Embedded
import androidx.room.Relation
import qwqeqrqwqeqr.android.room.database.entity.BookEntity
import qwqeqrqwqeqr.android.room.database.entity.PublisherEntity

data class PublisherAndBooks(
    @Embedded val publisherEntity: PublisherEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "publisher_id"
    )
    val bookEntity: List<BookEntity>,
)

