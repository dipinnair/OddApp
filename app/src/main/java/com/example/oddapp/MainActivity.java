package com.example.oddapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button b;
    String getnum1,res;
    int num1;
    int even;
    int odd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.num1);
        b=(Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                getnum1=ed1.getText().toString();
                num1=Integer.parseInt(getnum1);
                if(num1%2==0) {
                    res = "even";
                }
                    else{
                        res= "odd";
                    }
                Toast.makeText(getApplicationContext(), res, Toast.LENGTH_LONG).show();

            }
        });






    }
}
