package data.model

import android.content.ClipData
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ClipData.Item::class], version = 1)
abstract class DataBase: RoomDatabase() {
    abstract fun getDao(): DAOMarvel

    companion object {
        fun getDb(context: Context): DataBase {
            return Room.databaseBuilder(context.applicationContext, DataBase::class.java, "MarvelDB")
                .build()

        }
    }
}