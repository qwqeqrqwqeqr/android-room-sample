package qwqeqrqwqeqr.android.room.database.relation

import androidx.room.Embedded
import androidx.room.Relation
import qwqeqrqwqeqr.android.room.database.entity.UserEntity
import qwqeqrqwqeqr.android.room.database.entity.UserInfoEntity

data class UserAndUserInfo(
    @Embedded val userEntity: UserEntity,
    @Relation(
        entity = UserInfoEntity::class,
        parentColumn = "user_id",
        entityColumn = "user_id",
        projection = ["id", "user_id", "name", "gender", "age", "address_street","address_state","address_city"]
    )
    val userInfoEntity: UserInfoEntity
)

