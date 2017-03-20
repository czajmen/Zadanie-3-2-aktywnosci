package com.example.kczaja.zadanie3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ChildActivity extends AppCompatActivity {


    TextView colorFromAct1;
    Button accept,reject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        accept =  (Button)findViewById(R.id.confirm);
        reject = (Button)findViewById(R.id.discard);


        colorFromAct1 = (TextView) findViewById(R.id.colorFromAct1);
            String color = getIntent().getStringExtra("color");
        colorFromAct1.setText(color);

    }


    public void onClick(View view) {
        Button clickedButton = (Button) view;
        Intent intent = new Intent();
        intent.putExtra("color", clickedButton.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }




    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("result", 0);
        setResult(RESULT_OK, intent);
        super.onBackPressed();
    }

}
