package qwqeqrqwqeqr.android.room.domain.model

enum class Gender(var value: String) {
    Male(value = "Male"),
    Female(value = "Female")
}


fun String.toGender(): Gender =
    when(this){
       "Male" -> Gender.Male
        else -> Gender.Female
    }
