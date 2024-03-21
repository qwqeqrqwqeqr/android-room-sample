package qwqeqrqwqeqr.android.room.database.entity

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import qwqeqrqwqeqr.android.room.database.utils.Constants.Entity.USER_INFO_TABLE_NAME
import qwqeqrqwqeqr.android.room.domain.model.Address
import qwqeqrqwqeqr.android.room.domain.model.Gender


@Entity(
    tableName = USER_INFO_TABLE_NAME,
)
data class UserInfoEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0,

    @ColumnInfo(name = "user_id")
    var userId: Long,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "gender")
    var gender: Gender,

    @ColumnInfo(name = "age")
    val age: Int,

    @Embedded("address_")
    var address: Address
)

