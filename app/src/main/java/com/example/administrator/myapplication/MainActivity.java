package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView);
        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);

        Button btntan = (Button) findViewById(R.id.btntan);
        Button btnsin = (Button) findViewById(R.id.btnsin);
        Button btncos = (Button) findViewById(R.id.btncos);

        Button btnadd = (Button) findViewById(R.id.btnadd);
        Button btnsub= (Button) findViewById(R.id.btnsub);
        Button btndev = (Button) findViewById(R.id.btndev);
        Button btnmul = (Button) findViewById(R.id.btnmul);
        Button btnequ = (Button) findViewById(R.id.btnequ);
        Button btne = (Button) findViewById(R.id.btne);
        Button btnPI = (Button) findViewById(R.id.btnpi);
        Button btnc = (Button) findViewById(R.id.btnc);
        Button btnreset = (Button) findViewById(R.id.btnreset);
        Button btnop = (Button) findViewById(R.id.btnop);
        Button btncl = (Button) findViewById(R.id.btncl);
        Button btnpow = (Button) findViewById(R.id.btnpow);
        Button btnrev = (Button) findViewById(R.id.btnrev);
        Button btnabs = (Button) findViewById(R.id.btnabs);
        Button btnr = (Button) findViewById(R.id.btnr);
        Button btn3r = (Button) findViewById(R.id.btn3r);
        Button btnln = (Button) findViewById(R.id.btnln);
        Button btnlog = (Button) findViewById(R.id.btnlog);
        View.OnClickListener click = new View.OnClickListener(){
            @Override
            public void onClick(View v){    //함수정의
                switch(v.getId()){
                    case R.id.btn0:
                        break;
                    case R.id.btn1:
                        break;
                    case R.id.btn2:
                        break;
                    case R.id.btn3:
                        break;
                    case R.id.btn4:
                        break;
                    case R.id.btn5:
                        break;
                    case R.id.btn6:
                        break;
                    case R.id.btn7:
                        break;
                    case R.id.btn8:
                        break;
                    case R.id.btn9:
                        break;
                    case R.id.btnadd:
                        break;
                    case R.id.btndev:
                        break;
                    case R.id.btnsub:
                        break;
                    case R.id.btnmul:
                        break;
                    case R.id.btn3r:
                        break;
                    case R.id.btnr:
                        break;
                    case R.id.btntan:
                        break;
                    case R.id.btnsin:
                        break;
                    case R.id.btncos:
                        break;
                    case R.id.btnreset:
                        break;
                    case R.id.btnc:
                        break;
                    case R.id.btncl:
                        break;
                    case R.id.btnop:
                        break;
                    case R.id.btnln:
                        break;
                    case R.id.btnlog:
                        break;
                    case R.id.btnpow:
                        break;
                    case R.id.btnabs:
                        break;
                    case R.id.btne:
                        break;
                    case R.id.btnpi:
                        break;

                }
            }

        };
        btn0.setOnClickListener(click);
        btne.setOnClickListener(click);
        btnPI.setOnClickListener(click);
        btn1.setOnClickListener(click);
        btn2.setOnClickListener(click);
        btn3.setOnClickListener(click);
        btn4.setOnClickListener(click);
        btn5.setOnClickListener(click);
        btn6.setOnClickListener(click);
        btn7.setOnClickListener(click);
        btn8.setOnClickListener(click);
        btn9.setOnClickListener(click);
        btnc.setOnClickListener(click);
        btnreset.setOnClickListener(click);
        btnadd .setOnClickListener(click);
        btnrev.setOnClickListener(click);
        btndev.setOnClickListener(click);
        btntan.setOnClickListener(click);
        btnsin.setOnClickListener(click);
        btncos.setOnClickListener(click);
        btnsub.setOnClickListener(click);
        btnmul.setOnClickListener(click);
        btnequ.setOnClickListener(click);
        btnop.setOnClickListener(click);
        btncl.setOnClickListener(click);
        btnpow.setOnClickListener(click);
        btnabs.setOnClickListener(click);
        btnr.setOnClickListener(click);
        btn3r.setOnClickListener(click);
        btnlog.setOnClickListener(click);
        btnln.setOnClickListener(click);
    }
}
