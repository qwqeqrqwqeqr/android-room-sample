package qwqeqrqwqeqr.android.room.database.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import qwqeqrqwqeqr.android.room.database.converter.GenderTypeConverter
import qwqeqrqwqeqr.android.room.database.converter.GenreTypeConverter
import qwqeqrqwqeqr.android.room.database.converter.LocalDateTypeConverter
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object ConverterModule {

    @Provides
    @Singleton
    fun provideGenderTypeConverter(): GenderTypeConverter =
        GenderTypeConverter()

    @Provides
    @Singleton
    fun provideLocalDateTypeConverter(): LocalDateTypeConverter =
        LocalDateTypeConverter()

    @Provides
    @Singleton
    fun provideGenreTypeConverter(): GenreTypeConverter =
        GenreTypeConverter()



}
