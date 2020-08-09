package com.kim9212.myapplication;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {todo.class},version = 1)
public abstract class AppDataBase extends RoomDatabase {
public abstract  TodoDao todoDao();

}
