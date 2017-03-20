package com.example.kczaja.zadanie3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button orange, blue, red, green;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orange = (Button) findViewById(R.id.orange);
        blue = (Button) findViewById(R.id.blue);
        red = (Button) findViewById(R.id.red);
        green = (Button) findViewById(R.id.green);

        textView = (TextView)findViewById(R.id.answerFromAct2);
    }

    public void onClick(View view) {

        Button clickedButton = (Button) view;
        Intent intent = new Intent(getBaseContext(), ChildActivity.class);
        intent.putExtra("color", clickedButton.getText().toString());
        startActivityForResult(intent, 2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

            switch (resultCode) {
                case 2:
                    String answer = data.getStringExtra(getString(R.string.color));
                    textView.setText(answer);
                    break;

                case 3:
                    textView.setText(R.string.anuluj);
                    break;
            }
    }


}
