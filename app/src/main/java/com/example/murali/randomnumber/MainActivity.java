package com.example.murali.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void onCheck(View view) {
        EditText numberEditText = (EditText) findViewById(R.id.numberEditText);
        int numberEditTextInteger=Integer.parseInt(numberEditText.getText().toString());
        if(numberEditTextInteger==randomNumber)
        {
            Toast.makeText(MainActivity.this, "Yes!You got it", Toast.LENGTH_SHORT).show();
        }
        else if(numberEditTextInteger<randomNumber) {
            Toast.makeText(MainActivity.this, "Your number is Lower", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "your number is Upper", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand=new Random();
        randomNumber=rand.nextInt(10)+1;
    }
}
