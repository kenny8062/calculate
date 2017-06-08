package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.*;
import java.lang.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Stacks stack=new Stacks(200);
    String str=new String();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText textview = (EditText) findViewById(R.id.editText);
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
        Button btnsub = (Button) findViewById(R.id.btnsub);
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
        Button btndot = (Button) findViewById(R.id.btndot);
        btn0.setOnClickListener(this);
        btne.setOnClickListener(this);
        btnPI.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnc.setOnClickListener(this);
        btnreset.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnrev.setOnClickListener(this);
        btndev.setOnClickListener(this);
        btntan.setOnClickListener(this);
        btnsin.setOnClickListener(this);
        btncos.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btnequ.setOnClickListener(this);
        btnop.setOnClickListener(this);
        btncl.setOnClickListener(this);
        btnpow.setOnClickListener(this);
        btnabs.setOnClickListener(this);
        btnr.setOnClickListener(this);
        btn3r.setOnClickListener(this);
        btnlog.setOnClickListener(this);
        btnln.setOnClickListener(this);
    }
        @Override
        public void onClick(View v) {
            EditText txt = (EditText) findViewById(R.id.editText);
            double[] num = new double[100];
            String string2 = new String();
            String str2 = new String();
            char[] arr;
            char[] arr2 =new char[100];
            int a = 0;
            switch(v.getId()) {
                case R.id.btn0:
                    str = str + "0";
                    txt.setText(str);
                    break;
                case R.id.btn1:
                    str = str + "1";
                    txt.setText(str);
                    break;
                case R.id.btn2:
                    str = str + "2";
                    txt.setText(str);
                    break;
                case R.id.btn3:
                    str = str + "3";
                    txt.setText(str);
                    break;
                case R.id.btn4:
                    str = str + "4";
                    txt.setText(str);
                    break;
                case R.id.btn5:
                    str = str + "5";
                    txt.setText(str);
                    break;
                case R.id.btn6:
                    str = str + "6";
                    txt.setText(str);
                    break;
                case R.id.btn7:
                    str = str + "7";
                    txt.setText(str);
                    break;
                case R.id.btn8:
                    str = str + "8";
                    txt.setText(str);
                    break;
                case R.id.btn9:
                    str = str + "9";
                    txt.setText(str);
                    break;
                case R.id.btndot:
                    str = str + ".";
                    txt.setText(str);
                    break;
                case R.id.btnadd:
                    str = str + '+';
                    txt.setText(str);
                    break;
                case R.id.btndev:
                    str = str + '-';
                    txt.setText(str);
                    break;
                case R.id.btnsub:
                    str = str + '/';
                    txt.setText(str);
                    break;
                case R.id.btnmul:
                    str = str + '*';
                    txt.setText(str);
                    break;
                case R.id.btn3r:
                    str = str + "trpr(";
                    txt.setText(str);
                    break;
                case R.id.btnr:
                    str = str + "r(";
                    txt.setText(str);
                    break;
                case R.id.btntan:
                    str = str + "tan(";
                    txt.setText(str);
                    break;
                case R.id.btnsin:
                    str = str + "sin(";
                    txt.setText(str);
                    break;
                case R.id.btncos:
                    str = str + "cos(";
                    txt.setText(str);
                    break;
                case R.id.btnreset:
                    str = null;
                    txt.setText(str);
                    break;
                case R.id.btnc:
                    break;
                case R.id.btncl:
                    str = str + ")";
                    txt.setText(str);
                    break;
                case R.id.btnop:
                    str = str + "(";
                    txt.setText(str);
                    break;
                case R.id.btnln:
                    str = str + "ln(";
                    txt.setText(str);
                    break;
                case R.id.btnlog:
                    str = str + "log(";
                    txt.setText(str);
                    break;
                case R.id.btnabs:
                    str = str + "abs(";
                    txt.setText(str);
                    break;
                case R.id.btne:
                    str = str + Math.E;
                    txt.setText(str);
                    break;
                case R.id.btnpi:
                    str = str + Math.PI;
                    txt.setText(str);
                    break;
                case R.id.btnequ:
                    str = str + "=";
                    str2="";
                    arr = str.toCharArray();
                    for (int i = 0; i < 100; i++) num[i] = 0;
                    for(int i=0;i<100;i++) arr2[i]='0';
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == '+') {
                            for(int j=0;j<100;j++){
                                if(arr2[j]=='0'){
                                    arr2[j]='+';
                                    break;
                                }
                            }
                            for (int j = a; j < i; j++) {
                                string2 = string2 + arr[j];
                            }
                            a = i + 1;

                            for (int j = 0; j < 100; j++) {
                                if(string2.equals("")) break;
                                if (num[j] == 0) {
                                    num[j] = Double.parseDouble(string2);
                                    string2 = "";
                                    break;
                                }
                            }
                        } else if (arr[i] == '-') {
                            for(int j=0;j<100;j++){
                                if(arr2[j]=='0'){
                                    arr2[j]='-';
                                    break;
                                }
                            }
                            for (int j = a; j < i; j++) {
                                string2 = string2 + arr[j];
                            }
                            a = i + 1;
                            for (int j = 0; j < 100; j++) {
                                if(string2.equals("")) break;
                                if (num[j] == 0) {
                                    num[j] = Double.parseDouble(string2);
                                    string2 = "";
                                    break;
                                }
                            }
                        } else if (arr[i] == '*') {
                            for(int j=0;j<100;j++){
                                if(arr2[j]=='0'){
                                    arr2[j]='*';
                                    break;
                                }
                            }
                            for (int j = a; j < i; j++) {
                                string2 = string2 + arr[j];
                            }
                            a = i + 1;
                            for (int j = 0; j < 100; j++) {
                                if(string2.equals("")) break;
                                if (num[j] == 0) {
                                    num[j] = Double.parseDouble(string2);
                                    string2 = "";
                                    break;
                                }
                            }
                        } else if (arr[i] == '/') {
                            for(int j=0;j<100;j++){
                                if(arr2[j]=='0'){
                                    arr2[j]='/';
                                    break;
                                }
                            }
                            for (int j = a; j < i; j++) {
                                string2 = string2 + arr[j];
                            }
                            a = i + 1;
                            for (int j = 0; j < 100; j++) {
                                if(string2.equals("")) break;
                                if (num[j] == 0) {
                                    num[j] = Double.parseDouble(string2);
                                    string2 = "";
                                    break;
                                }
                            }
                        } else if (arr[i] == 't' && arr[i + 1] == 'r' && arr[i + 2] == 'p') {
                            for (int j = i + 5; arr[j] != ')'; j++) {
                                string2 = string2 + arr[j];
                                a = j + 2;
                            }
                            i = a-1;
                            for (int j = 0; j < 100; j++) {
                                if(string2.equals("")) break;
                                if (num[j] == 0) {
                                    num[j] = Math.round(Math.cbrt(Double.parseDouble(string2))*10)/10.0;
                                    string2 = "";
                                    break;
                                }
                            }
                        } else if (arr[i] == 'r' && arr[i + 1] == '(') {
                            for (int j = i + 2; arr[j] != ')'; j++) {
                                string2 = string2 + arr[j];
                                a = j + 2;
                            }
                            i = a-1;
                            for (int j = 0; j < 100; j++) {
                                if(string2.equals("")) break;
                                if (num[j] == 0) {
                                    num[j] = Math.round(Math.sqrt(Double.parseDouble(string2))*10)/10.0;
                                    string2 = "";
                                    break;
                                }
                            }
                        } else if (arr[i] == 't' && arr[i + 1] == 'a') {
                            for (int j = i + 4; arr[j] != ')'; j++) {
                                string2 = string2 + arr[j];
                                a = j + 2;
                            }
                            i = a-1;
                            for (int j = 0; j < 100; j++) {
                                if(string2.equals("")) break;
                                if (num[j] == 0) {
                                    num[j] = Math.round(Math.tan(Double.parseDouble(string2))*10)/10.0;
                                    string2 = "";
                                    break;
                                }
                            }
                        } else if (arr[i] == 'c' && arr[i + 1] == 'o') {
                            for (int j = i + 4; arr[j] != ')'; j++) {
                                string2 = string2 + arr[j];
                                a = j + 2;
                            }
                            i = a-1;
                            for (int j = 0; j < 100; j++) {
                                if(string2.equals("")) break;
                                if (num[j] == 0) {
                                    num[j] = Math.round(Math.cos(Double.parseDouble(string2))*10)/10.0;
                                    string2 = "";
                                    break;
                                }
                            }
                        } else if (arr[i] == 's' && arr[i + 1] == 'i') {
                            for (int j = i + 4; arr[j] != ')'; j++) {
                                string2 = string2 + arr[j];
                                a = j + 2;
                            }
                            i = a-1;
                            for (int j = 0; j < 100; j++) {
                                if(string2.equals("")) break;
                                if (num[j] == 0) {
                                    num[j] = Math.round(Math.sin(Double.parseDouble(string2))*10)/10.0;
                                    string2 = "";
                                    break;
                                }
                            }
                        }else if (arr[i] == 'l' && arr[i + 1] == 'n') {
                            for (int j = i + 3; arr[j] != ')'; j++) {
                                string2 = string2 + arr[j];
                                a = j + 2;
                            }
                            i = a-1;
                            for (int j = 0; j < 100; j++) {
                                if(string2.equals("")) break;
                                if (num[j] == 0) {
                                    num[j] = Math.round(Math.log(Double.parseDouble(string2))*10)/10.0;
                                    string2 = "";
                                    break;
                                }
                            }
                        }else if (arr[i] == 'l' && arr[i + 1] == 'o') {
                            for (int j = i + 4; arr[j] != ')'; j++) {
                                string2 = string2 + arr[j];
                                a = j + 2;
                            }
                            i = a-1;
                            for (int j = 0; j < 100; j++) {
                                if(string2.equals("")) break;
                                if (num[j] == 0) {
                                    num[j] = Math.round(Math.log10(Double.parseDouble(string2))*10)/10.0;
                                    string2 = "";
                                    break;
                                }
                            }
                        }else if(arr[i]=='('){
                            arr2[i]='(';
                        }else if(arr[i]==')') {
                            arr2[i] = ')';
                            a=i+1;
                        }
                        if(arr[i]=='='){
                            for (int j = a; j < i; j++) {
                                string2 = string2 + arr[j];
                            }
                            a = i + 1;
                            for (int j = 0; j < 100; j++) {
                                if(string2.equals("")) break;
                                if (num[j] == 0) {
                                    num[j] = Double.parseDouble(string2);
                                    string2 = "";
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    int i=0;
                    int j=0;
                    while(num[j]!=0&&arr2[i]!='0'){
                        if(arr2[i]=='('){
                            str2= str2 +'(';
                            i++;
                            while(arr2[i]==')'){
                                str2= str2 + Double.toString(num[j++]);
                                str2= str2 + arr2[i++];
                            }
                            str2= str2 + Double.toString(num[j++]);
                            str2= str2 + arr2[i++];
                            if(arr2[i]!='0') str2= str2 + arr2[i++];
                        }else{
                            str2= str2 + Double.toString(num[j++]);
                            str2= str2 + arr2[i++];
                        }
                    }
                    if(num[j]!=0)  str2= str2 + Double.toString(num[j++]);
                    txt.setText(str2);
                    str="";
                    break;
            }
        }
}
