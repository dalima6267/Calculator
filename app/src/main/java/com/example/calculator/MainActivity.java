package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bdiv,beql,bclr,bdel,bmul;
    EditText e1;
    Float v1,v2;
    Boolean ifadd,ifdiv,ifmul,ifsub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        badd=findViewById(R.id.badd);
        bsub=findViewById(R.id.bsub);
        bmul=findViewById(R.id.bmul);
        bdiv=findViewById(R.id.bdiv);
        beql=findViewById(R.id.beql);
        bclr=findViewById(R.id.bclr);
        bdel=findViewById(R.id.bdel);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "4");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() + "0");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1= Float.valueOf(e1.getText()+"");
        ifadd=true;
        e1.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1= Float.valueOf(e1.getText()+"");
                ifsub=true;
                e1.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1= Float.valueOf(e1.getText()+"");
                ifmul=true;
                e1.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1= Float.valueOf(e1.getText()+"");
                ifdiv=true;
                e1.setText(null);
            }
        });
        beql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 v2= Float.valueOf(e1.getText()+"");
                 if(ifadd==true){
                     e1.setText(v1+v2+"");
                     ifadd=false;
                 }
                if(ifsub==true){
                    e1.setText(v1-v2 +"");
                    ifsub=false;
                }
                if(ifmul==true){
                    e1.setText(v1*v2 +"");
                    ifmul=false;
                }
                if(ifdiv==true){
                    e1.setText(v1/v2 +"");
                    ifdiv=false;
                }
            }
        });
        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
            }
        });
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res=e1.getText().toString();
                if(res.length()>0){
                    res=res.substring(0,res.length()-1);
                    e1.setText(res);
                }
            }
        });
    }
}