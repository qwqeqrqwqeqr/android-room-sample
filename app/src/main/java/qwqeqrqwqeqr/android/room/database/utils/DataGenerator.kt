package qwqeqrqwqeqr.android.room.database.utils

import kotlinx.datetime.LocalDate
import qwqeqrqwqeqr.android.room.database.entity.BookEntity
import qwqeqrqwqeqr.android.room.database.entity.PublisherEntity
import qwqeqrqwqeqr.android.room.database.entity.UserAndBookEntity
import qwqeqrqwqeqr.android.room.database.entity.UserEntity
import qwqeqrqwqeqr.android.room.database.entity.UserInfoEntity
import qwqeqrqwqeqr.android.room.domain.model.Address
import qwqeqrqwqeqr.android.room.domain.model.Gender
import qwqeqrqwqeqr.android.room.domain.model.Genre

object DataGenerator {

    private val SAMPLE_ADDRESS = Address(
        street = "123 Main Street",
        city = "Anytown",
        state = "California"
    )

    val SAMPLE_USER_ENTITY_LIST: Array<UserEntity> = arrayOf(
        UserEntity(userId = 1L, email = "john.doe@example.com"),
        UserEntity(userId = 2L, email = "emily.smith@example.com"),
        UserEntity(userId = 3L, email = "david.wong@example.com"),
        UserEntity(userId = 4L, email = "sarah.jones@example.com"),
        UserEntity(userId = 5L, email = "michael.brown@example.com")
    )

    val SAMPLE_USER_INFO_ENTITY_LIST: Array<UserInfoEntity> = arrayOf(
        UserInfoEntity(
            userId = 1L,
            name = "John Doe",
            gender = Gender.Male,
            age = 35,
            address = SAMPLE_ADDRESS
        ),
        UserInfoEntity(
            userId = 2L,
            name = "Emily Smith",
            gender = Gender.Female,
            age = 28,
            address = SAMPLE_ADDRESS

        ),
        UserInfoEntity(
            userId = 3L,
            name = "David Wong",
            gender = Gender.Male,
            age = 42,
            address = SAMPLE_ADDRESS

        ),
        UserInfoEntity(
            userId = 4L,
            name = "Sarah Jones",
            gender = Gender.Female,
            age = 45,
            address = SAMPLE_ADDRESS

        ),
        UserInfoEntity(
            userId = 5L,
            name = "Michael Brown",
            gender = Gender.Male,
            age = 31,
            address = SAMPLE_ADDRESS

        ),
    )


    val SAMPLE_PUBLISHER_ENTITY_LIST: Array<PublisherEntity> = arrayOf(
        PublisherEntity(id = 1L, name = "Scribner"),
        PublisherEntity(id = 2L, name = "J. B. Lippincott & Co."),
        PublisherEntity(id = 3L, name = "Little, Brown and Company"),
        PublisherEntity(id = 4L, name = "T. Egerton, Whitehall"),
        PublisherEntity(id = 5L, name = "Secker & Warburg"),
        PublisherEntity(id = 6L, name = "Allen & Unwin"),
        PublisherEntity(id = 7L, name = "HarperCollins"),
        PublisherEntity(id = 8L, name = "Doubleday")
    )

    val SAMPLE_BOOK_ENTITY_LIST: Array<BookEntity> = arrayOf(
        BookEntity(
            bookId = 1L,
            title = "The Great Gatsby",
            author = "F. Scott Fitzgerald",
            publisherId = 1L,
            publicationDate = LocalDate(1925, 4, 10),
            price = 12.99f,
            genre = listOf(Genre.Classic, Genre.Fiction)
        ),
        BookEntity(
            bookId = 2L,
            title = "To Kill a Mockingbird",
            author = "Harper Lee",
            publisherId = 2L,
            publicationDate = LocalDate(1960, 7, 11),
            price = 14.95f,
            genre = listOf(Genre.Novel, Genre.Fiction)
        ),
        BookEntity(
            bookId = 3L,
            title = "The Catcher in the Rye",
            author = "J. D. Salinger",
            publisherId = 3L,
            publicationDate = LocalDate(1951, 7, 16),
            price = 10.99f,
            genre = listOf(Genre.Fiction)
        ),
        BookEntity(
            bookId = 4L,
            title = "Pride and Prejudice",
            author = "Jane Austen",
            publisherId = 4L,
            publicationDate = LocalDate(1813, 1, 28),
            price = 9.99f,
            genre = listOf(Genre.Fiction, Genre.Romance)
        ),
        BookEntity(
            bookId = 5L,
            title = "1984",
            author = "George Orwell",
            publisherId = 5L,
            publicationDate = LocalDate(1949, 6, 8),
            price = 11.99f,
            genre = listOf(Genre.Fiction)
        ),
        BookEntity(
            bookId = 6L,
            title = "The Hobbit",
            author = "J.R.R. Tolkien",
            publisherId = 6L,
            publicationDate = LocalDate(1937, 9, 21),
            price = 8.99f,
            genre = listOf(Genre.Fiction, Genre.Fantasy)
        ),
        BookEntity(
            bookId = 7L,
            title = "The Alchemist",
            author = "Paulo Coelho",
            publisherId = 7L,
            publicationDate = LocalDate(1988, 1, 1),
            price = 10.50f,
            genre = listOf(Genre.Fiction)
        ),
        BookEntity(
            bookId = 8L,
            title = "The Da Vinci Code",
            author = "Dan Brown",
            publisherId = 8L,
            publicationDate = LocalDate(2003, 3, 18),
            price = 12.75f,
            genre = listOf(Genre.Fiction, Genre.Mystery)
        ),
        BookEntity(
            bookId = 9L,
            title = "The Goldfinch",
            author = "Donna Tartt",
            publisherId = 3L,
            publicationDate = LocalDate(2013, 10, 22),
            price = 16.99f,
            genre = listOf(Genre.Fiction)
        ),
    )

    val SAMPLE_USER_AND_BOOK_ENTITY_LIST: Array<UserAndBookEntity> = arrayOf(
        UserAndBookEntity(1L, 1L),
        UserAndBookEntity(1L, 2L),
        UserAndBookEntity(1L, 3L),
        UserAndBookEntity(1L, 4L),
        UserAndBookEntity(1L, 5L),
        UserAndBookEntity(2L, 1L),
        UserAndBookEntity(2L, 2L),
        UserAndBookEntity(2L, 3L),
        UserAndBookEntity(2L, 5L),
        UserAndBookEntity(3L, 8L),
        UserAndBookEntity(3L, 9L),
        UserAndBookEntity(3L, 5L),
        UserAndBookEntity(4L, 9L),
        UserAndBookEntity(4L, 3L),
        UserAndBookEntity(5L, 1L),
        UserAndBookEntity(5L, 3L),
        UserAndBookEntity(5L, 5L),
        UserAndBookEntity(5L, 7L),
        UserAndBookEntity(5L, 9L),
    )
}