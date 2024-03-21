package qwqeqrqwqeqr.android.room.database.converter

import androidx.room.TypeConverter
import qwqeqrqwqeqr.android.room.domain.model.Gender
import qwqeqrqwqeqr.android.room.domain.model.toGender
import javax.inject.Inject

class GenderTypeConverter @Inject constructor(
) {
    @TypeConverter
    fun jsonTypeToGenderType(value: String): Gender {
        return value.toGender()
    }

    @TypeConverter
    fun genderTypeToJsonType(type: Gender): String {
        return type.toString()
    }
}