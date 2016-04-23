package com.example.mehedi.dfsmania;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private static Button button_input;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
    }
    public void OnClickButtonListener(){
        //e1 = (EditText)findViewById(R.id.editText);
        button_input = (Button)findViewById(R.id.button1);
        button_input.setOnClickListener(new View.OnClickListener(){
               public void onClick(View v){
                   Intent i = new Intent(getApplicationContext(), Input.class);
                   //sending data to another activity
                   //String s = e1.getText().toString();
                   //i.putExtra("name", s);
                   /////////
                   startActivity(i);
               }
            }

        );





    }
}
