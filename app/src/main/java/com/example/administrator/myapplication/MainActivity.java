package com.example.administrator.myapplication;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String str=new String();
    Calculate cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("mylog"," i am created");
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
        Button btndev = (Button) findViewById(R.id.btndev);
        Button btnsub = (Button) findViewById(R.id.btnsub);
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
        Button btnr = (Button) findViewById(R.id.btnr);
        Button btn3r = (Button) findViewById(R.id.btn3r);
        Button btnln = (Button) findViewById(R.id.btnln);
        Button btnlog = (Button) findViewById(R.id.btnlog);
        Button btndot = (Button) findViewById(R.id.btndot);
        btndot.setOnClickListener(this);
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
        btnr.setOnClickListener(this);
        btn3r.setOnClickListener(this);
        btnlog.setOnClickListener(this);
        btnln.setOnClickListener(this);
    }
        @Override
        public void onClick(View v) {
            try{
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
                case R.id.btnpow:
                    str = str + "^(";
                    txt.setText(str);
                    break;
                case R.id.btnreset:
                    str = "";
                    txt.setText(str);
                    break;
                case R.id.btnc:
                    int q=1;
                    if (str.length() >= 1) {
                        char[] w = str.substring(str.length() - 1, str.length()).toCharArray();
                        if (w[0] == '(') {
                            if(str.length()>=2) {
                                w = str.substring(str.length() - 2, str.length()).toCharArray();
                                if (w[0] == 'r') {
                                    str = str.substring(0, str.length() - 2);
                                    q--;
                                } else {
                                    if(str.length()>=4) {
                                        w = str.substring(str.length() - 4, str.length()).toCharArray();
                                        if (w[0] == 't' || w[0] == 's' || w[0] == 'c') {
                                            str = str.substring(0, str.length() - 4);
                                            q--;
                                        } else if (w[0] == 'r') {
                                            str = str.substring(0, str.length() - 5);
                                            q--;
                                        }
                                    }
                                }
                                if (q == 1) {
                                    str = str.substring(0, str.length() - 1);
                                }
                                q = 1;
                            }
                        } else {
                            str = str.substring(0, str.length() - 1);
                        }
                    }
                    txt.setText(str);
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
                    txt.setText(str);
                    check(str);
                    ReString res=new ReString(str);
                    check(res.tostring());
                    res.setplusString("=");
                    cal = new Calculate(res.getString());
                    txt.setText(cal.result());
                    str = cal.result();
                    break;
             }
            }catch(CantcalException  ex) {
                Snackbar.make(v,ex.getMessage(), Snackbar.LENGTH_LONG).show();
            }
        }

    public static String check(String str) throws CantcalException {
        char[] chr=str.toCharArray();
        int num1=0;
        int num2=0;
        for(int i=0;i<chr.length;i++) {
            if(chr[i]=='(') num1++;
            if(chr[i]==')') num2++;
        }
        if(num1!=num2) {
            CantcalException ext = new CantcalException();
            throw ext;
        }
        for(int i=0;i<chr.length-1;i++){
            if((chr[i]=='-'||chr[i]=='*'||chr[i]=='/'||chr[i]=='+')&&(chr[i+1]=='-'||chr[i+1]=='*'||chr[i+1]=='/'||chr[i+1]=='+'||chr[i+1]=='=')) {
                CantcalException ext = new CantcalException();
                throw ext;
            }
        }
        return str;
    }
}
