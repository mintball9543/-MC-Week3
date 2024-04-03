package com.example.week3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button1, button3, button4;
    EditText edit1, edit2;
    TextView textView;
    String num1, num2;

    Integer result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        textView = (TextView) findViewById(R.id.textView);

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textView.setText("result = " + result);
                //Toast.makeText(getApplicationContext(), "button1 clicked", Toast.LENGTH_SHORT).show();

            }
        });

        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);

        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new MyOnClick());
    }

    public void btn2click(View v) {
        String str;
        Button btn = (Button) v;
        str = btn.getText().toString() + "clicked";
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }

    public void onClick(View v){
        Toast.makeText(getApplicationContext(), "button3 clicked", Toast.LENGTH_SHORT).show();
    }

    class MyOnClick implements View.OnClickListener {
        public void onClick(View v){
            Toast.makeText(getApplicationContext(), "button4 clicked", Toast.LENGTH_SHORT).show();
        }
    }
}