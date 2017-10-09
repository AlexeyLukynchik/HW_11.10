package com.example.lukyn.convert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText inputText;
    Button convertButton;
    TextView outputRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = (EditText)findViewById(R.id.edit_text);
        convertButton = (Button)findViewById(R.id.convert);
        outputRes = (TextView)findViewById(R.id.result);


        convertButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
double rest;
        if(TextUtils.isEmpty(inputText.getText())){

         rest = MyConvert.Conv(Double.parseDouble(inputText.getText().toString()));

            outputRes.setText(""+ rest);
        }

    }
}
