package com.example.kczaja.zadanie3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ChildActivity extends AppCompatActivity {


    TextView colorFromAct1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        colorFromAct1 = (TextView) findViewById(R.id.colorFromAct1);
            String color = getIntent().getStringExtra("color");
        colorFromAct1.setText(color);

    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("result", 0);
        setResult(RESULT_OK, intent);
        super.onBackPressed();
    }

}
