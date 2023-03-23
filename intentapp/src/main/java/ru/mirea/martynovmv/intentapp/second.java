package ru.mirea.martynovmv.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {
    private TextView txtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String text = (String) getIntent().getSerializableExtra("key");
        txtv = findViewById(R.id.textView1);
        int num = 20*20;
        String msg = "«КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ ЧИСЛО "+num+", А ТЕКУЩЕЕ ВРЕМЯ: "+text;
        txtv.setText(msg);


    }
}