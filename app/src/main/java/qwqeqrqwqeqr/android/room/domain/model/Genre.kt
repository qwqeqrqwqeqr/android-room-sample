package qwqeqrqwqeqr.android.room.domain.model

enum class Genre(var value: String) {
    Novel(value = "Novel"),
    Poetry(value = "Poetry"),
    Criticism(value = "Criticism"),
    History(value = "History"),
    Science(value = "Science"),
    Mystery(value = "Mystery"),
    SF(value = "SF"),
    Fantasy(value = "Fantasy"),
    Romance(value = "Romance"),
    Classic(value = "Classic"),
    Fiction(value = "Fiction")
}


fun String.toGenre(): Genre =
    when (this) {
        "Novel" -> Genre.Novel
        "Poetry" -> Genre.Poetry
        "Criticism" -> Genre.Criticism
        "History" -> Genre.History
        "Science" -> Genre.Science
        "Mystery" -> Genre.Mystery
        "SF" -> Genre.SF
        "Fantasy" -> Genre.Fantasy
        "Classic" -> Genre.Classic
        "Fiction" -> Genre.Fiction
        else -> Genre.Romance
    }