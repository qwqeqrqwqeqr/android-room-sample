package qwqeqrqwqeqr.android.room.database.converter

import androidx.room.TypeConverter
import kotlinx.datetime.LocalDate

class LocalDateTypeConverter {
    @TypeConverter
    fun jsonTypeToLocalDate(value: String): LocalDate {
        return LocalDate.parse(value)
    }

    @TypeConverter
    fun localDateToJsonType(type: LocalDate): String {
        return type.toString()
    }
}