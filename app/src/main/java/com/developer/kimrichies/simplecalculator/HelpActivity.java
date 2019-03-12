package com.developer.kimrichies.simplecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        TextView textView = (TextView)findViewById(R.id.HelptextView);
        textView.setText("This is a simple Calculator. Fill two operands and click Plus, minus, times,  " +
                "or divide button");
    }

    public void onClose (View v1){
        super.finish();
    }
}
