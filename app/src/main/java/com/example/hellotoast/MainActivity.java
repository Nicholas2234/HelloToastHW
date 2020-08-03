package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NUMBER ="com.example.helloToastHW.extra.MESSAGE" ;
    private static final int TEXT_REQUEST =1 ;
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void sayHello(View view){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        String  num = mShowCount.getText().toString();
        intent.putExtra(EXTRA_NUMBER, num);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    public void countUp(View view){
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }

}