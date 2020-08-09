package com.kim9212.myapplication;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

//꼭만들어야함
@Entity
public class todo {

    //아이디를 내가 직접주지않고 알아서 하는 코드
    @PrimaryKey(autoGenerate =  true)
    private int id;
    private String title;

    public todo(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
