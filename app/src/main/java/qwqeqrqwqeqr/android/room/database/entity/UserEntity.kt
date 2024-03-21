package qwqeqrqwqeqr.android.room.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import qwqeqrqwqeqr.android.room.database.utils.Constants.Entity.USER_TABLE_NAME


@Entity(tableName = USER_TABLE_NAME)
data class UserEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    var userId: Long = 0,

    @ColumnInfo(name = "email")
    var email: String,

    @ColumnInfo(name = "created_at", defaultValue = "(CURRENT_TIMESTAMP)")
    var createdAt: String? = null,
)

