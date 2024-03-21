package qwqeqrqwqeqr.android.room.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import qwqeqrqwqeqr.android.room.database.utils.Constants.Entity.PUBLISHER_TABLE_NAME

@Entity(
    tableName = PUBLISHER_TABLE_NAME
)
data class PublisherEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Long = 0,

    @ColumnInfo(name = "name")
    val name: String,


)