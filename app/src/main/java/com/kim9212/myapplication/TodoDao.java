package com.kim9212.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TodoDao {
    @Query("SELECT * FROM todo")
    List<todo> getAll();

    @Insert
    void insert(todo todo);

    @Update
    void  update(todo todo);
    @Delete
    void delet(todo todo);
}
