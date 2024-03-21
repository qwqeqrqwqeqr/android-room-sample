package qwqeqrqwqeqr.android.room.database.di

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import qwqeqrqwqeqr.android.room.database.converter.GenderTypeConverter
import qwqeqrqwqeqr.android.room.database.converter.GenreTypeConverter
import qwqeqrqwqeqr.android.room.database.converter.LocalDateTypeConverter
import qwqeqrqwqeqr.android.room.database.dao.BookDao
import qwqeqrqwqeqr.android.room.database.dao.PublisherDao
import qwqeqrqwqeqr.android.room.database.dao.UserAndBookDao
import qwqeqrqwqeqr.android.room.database.dao.UserDao
import qwqeqrqwqeqr.android.room.database.dao.UserInfoDao
import qwqeqrqwqeqr.android.room.database.entity.BookEntity
import qwqeqrqwqeqr.android.room.database.entity.PublisherEntity
import qwqeqrqwqeqr.android.room.database.entity.UserAndBookEntity
import qwqeqrqwqeqr.android.room.database.entity.UserEntity
import qwqeqrqwqeqr.android.room.database.entity.UserInfoEntity


@Database(
    entities = [
        BookEntity::class,
        UserEntity::class,
        UserInfoEntity::class,
        PublisherEntity::class,
        UserAndBookEntity::class
    ],
    version = 1,
    exportSchema = true
)
@TypeConverters(
    value = [
        LocalDateTypeConverter::class,
        GenderTypeConverter::class,
        GenreTypeConverter::class
    ]
)

abstract class MyDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun bookDao(): BookDao
    abstract fun userAndBookDao(): UserAndBookDao
    abstract fun userInfoDao(): UserInfoDao
    abstract fun publisherDao(): PublisherDao
}