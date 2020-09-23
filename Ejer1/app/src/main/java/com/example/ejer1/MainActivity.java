package com.example.ejer1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView sss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sss = (TextView) findViewById(R.id.txt_hola);
        findViewById(R.id.button2);
    }
    public void ocultar(View v){

        if(sss.getVisibility() == View.GONE){
            sss.setVisibility(View.VISIBLE);
        }else{
            sss.setVisibility(View.GONE);
        }

    }


}