package com.strawnetwork.anartest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtNumber2,txtNumber1;
    private TextView txtResult;
    private Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumber1=findViewById(R.id.txtNumber1);
        txtNumber2=findViewById(R.id.txtNumber2);
        txtResult=findViewById(R.id.txtResult);
        btnAdd=findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1=txtNumber1.getText().toString();
                String text2=txtNumber2.getText().toString();
                if(text1.isEmpty()||text2.isEmpty())
                    txtResult.setText("NaN");
                else
                {
                    float res=Float.valueOf(text1)+Float.valueOf(text2);
                    txtResult.setText(String.valueOf(res));
                }
            }
        });

    }
}