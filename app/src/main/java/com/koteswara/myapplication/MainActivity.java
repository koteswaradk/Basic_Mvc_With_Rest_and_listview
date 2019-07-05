package com.koteswara.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_editText_name,et_editText_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_editText_name=(EditText) findViewById(R.id.editText_name);
        et_editText_password=(EditText)findViewById(R.id.editText_password);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= et_editText_name.getText().toString();
                String pass= et_editText_password.getText().toString();
                if (name.equalsIgnoreCase("koti")&&(pass.equalsIgnoreCase("123"))){
                    Toast.makeText(getBaseContext(),"success",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getBaseContext(),"fail",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
