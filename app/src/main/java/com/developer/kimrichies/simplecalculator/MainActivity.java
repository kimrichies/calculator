package com.developer.kimrichies.simplecalculator;

import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonHandler (View v){
        try {
            //Set a reference to the edit text

            EditText no1 = (EditText) findViewById(R.id.val1);//Reference to the first number entry
            EditText no2 = (EditText) findViewById(R.id.Val2);//Reference to the Second number entry

            String val1 = no1.getText().toString();
            String val2 = no2.getText().toString();

            //Convert String to integer
            int value1 = Integer.parseInt(val1);
            int value2 = Integer.parseInt(val2);

            //Check which button has been clicked
            if (v.getId() == R.id.addButton) {

                //double sum = (double)value1 + value2;
                int sum = value1 + value2;

                TextView resultView = (TextView) findViewById(R.id.ViewRes);
                //resultView.setText(Double.toString(sum));
                resultView.setText(String.valueOf(sum));
            }

            //Code to subtract the numbers
            else if (v.getId() == R.id.MinusButton) {
                int sub = value1 - value2;

                TextView resultView = (TextView) findViewById(R.id.ViewRes);
                resultView.setText(String.valueOf(sub));
            }

            //Code to execute the Multiplication of numbers
            else if (v.getId() == R.id.timesButton) {
                int mult = value1 * value2;

                TextView resultView = (TextView) findViewById(R.id.ViewRes);
                resultView.setText(String.valueOf(mult));
            }

            //Code to execute the Division of numbers
            else if (v.getId() == R.id.divButton) {
                int divide = value1 / value2;

                TextView resultView = (TextView) findViewById(R.id.ViewRes);
                resultView.setText(String.valueOf(divide));
            }

            //Code to clear the text view
            else if (v.getId() == R.id.ClearButton) {
                TextView resultView = (TextView) findViewById(R.id.ViewRes);
                resultView.setText("= 0");

            }
        }

        catch (NumberFormatException e){
            e.getStackTrace();
        }


    }

    //These two methods could also be part of the if..else statement but for code readability i separated them
    //Method for the close button
    public void onClose (View v1){
        super.finish();
    }

    //This method displays the Help text
    public void helpMethod (View v) {
        Intent intent = new Intent(this, HelpActivity.class);//Explicit intent because we are sending to another class
        startActivity(intent);

    }
}
