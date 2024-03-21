package qwqeqrqwqeqr.android.room.database.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import qwqeqrqwqeqr.android.room.database.dao.BookDao
import qwqeqrqwqeqr.android.room.database.dao.PublisherDao
import qwqeqrqwqeqr.android.room.database.dao.UserAndBookDao
import qwqeqrqwqeqr.android.room.database.dao.UserDao
import qwqeqrqwqeqr.android.room.database.dao.UserInfoDao
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DaoModule {

    @Provides
    @Singleton
    fun provideUserDao(
        myDatabase: MyDatabase,
    ): UserDao = myDatabase.userDao()


    @Provides
    @Singleton
    fun provideUserInfoDao(
        myDatabase: MyDatabase,
    ): UserInfoDao = myDatabase.userInfoDao()

    @Provides
    @Singleton
    fun provideBookDao(
        myDatabase: MyDatabase,
    ): BookDao = myDatabase.bookDao()


    @Provides
    @Singleton
    fun providePublisherDao(
        myDatabase: MyDatabase,
    ): PublisherDao = myDatabase.publisherDao()


    @Provides
    @Singleton
    fun provideUserAndBookDao(
        myDatabase: MyDatabase,
    ): UserAndBookDao = myDatabase.userAndBookDao()


}