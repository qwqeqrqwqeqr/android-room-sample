package qwqeqrqwqeqr.android.room

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import qwqeqrqwqeqr.android.room.database.dao.BookDao
import qwqeqrqwqeqr.android.room.database.dao.PublisherDao
import qwqeqrqwqeqr.android.room.database.dao.UserAndBookDao
import qwqeqrqwqeqr.android.room.database.dao.UserDao
import qwqeqrqwqeqr.android.room.database.dao.UserInfoDao
import qwqeqrqwqeqr.android.room.database.di.MyDatabase
import qwqeqrqwqeqr.android.room.database.utils.DataGenerator.SAMPLE_BOOK_ENTITY_LIST
import qwqeqrqwqeqr.android.room.database.utils.DataGenerator.SAMPLE_PUBLISHER_ENTITY_LIST
import qwqeqrqwqeqr.android.room.database.utils.DataGenerator.SAMPLE_USER_AND_BOOK_ENTITY_LIST
import qwqeqrqwqeqr.android.room.database.utils.DataGenerator.SAMPLE_USER_ENTITY_LIST
import qwqeqrqwqeqr.android.room.database.utils.DataGenerator.SAMPLE_USER_INFO_ENTITY_LIST
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var database: MyDatabase
    @Inject
    lateinit var userDao: UserDao
    @Inject
    lateinit var userInfoDao: UserInfoDao
    @Inject
    lateinit var bookDao: BookDao
    @Inject
    lateinit var publisherDao: PublisherDao
    @Inject
    lateinit var userAndBookDao: UserAndBookDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch(Dispatchers.IO) {
            initializeDatabase(database, userDao, userInfoDao, bookDao, publisherDao, userAndBookDao)
        }
    }
}



private suspend fun initializeDatabase(
    database: MyDatabase,
    userDao: UserDao,
    userInfoDao: UserInfoDao,
    bookDao: BookDao,
    publisherDao: PublisherDao,
    userAndBookDao: UserAndBookDao
){
    database.clearAllTables()
    userDao.insertUser(*SAMPLE_USER_ENTITY_LIST)
    userInfoDao.insertUserInfo(*SAMPLE_USER_INFO_ENTITY_LIST)
    publisherDao.insertPublisher(*SAMPLE_PUBLISHER_ENTITY_LIST)
    bookDao.insertBook(*SAMPLE_BOOK_ENTITY_LIST)
    userAndBookDao.insertUserAndBook(*SAMPLE_USER_AND_BOOK_ENTITY_LIST)
}

