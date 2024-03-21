package qwqeqrqwqeqr.android.room.database.converter

import androidx.room.TypeConverter
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import qwqeqrqwqeqr.android.room.domain.model.Genre
import javax.inject.Inject

class GenreTypeConverter @Inject constructor() {
    @TypeConverter
    fun jsonTypeToGenreType(value: String): List<Genre> {
        return Json.decodeFromString<List<Genre>>(value)
    }

    @TypeConverter
    fun genreTypeToJsonType(type: List<Genre>): String {
        return Json.encodeToString(type)
    }
}