package com.kim9212.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mtodoEditText;
    private TextView mResultTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtodoEditText=findViewById(R.id.todo);
        mResultTextview=findViewById(R.id.textView);

        //데이타베이스 객체 db는 무조건 벡그라운드에서
        //하지않으면 에러가납니다 allowmainthread를 쓰면 공부용으로 괜찮다
        //실무는 벡그라운드에서 한다
        final AppDataBase db= Room.databaseBuilder(this,AppDataBase.class,"todo-db")
                .allowMainThreadQueries().build();

        mResultTextview.setText(db.todoDao().getAll().toString());

        //여기서 insert만 바꾸면됨
        findViewById(R.id.add_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.todoDao().insert(new todo(mtodoEditText.getText().toString()));
                mResultTextview.setText(db.todoDao().getAll().toString());
            }
        });

    }
}