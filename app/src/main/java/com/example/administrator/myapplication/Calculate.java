package com.example.administrator.myapplication;

import android.widget.Toast;

/**
 * Created by Administrator on 2017-06-12.
 */

public class Calculate {
    private String str="";
    Charstacks cstr;
    Doublestacks dstr;
    Calculate(String str){
            this.str = str;
            cstr = new Charstacks();
            dstr = new Doublestacks();
    }
    public double calcul(double num1,double num2, char res){
        if(res=='+') return num1+num2;
        else if(res=='-') return num1-num2;
        else if(res=='*') return num1*num2;
        else{return num1/num2;}
    }
    public void calc(){
            char ch = '\0';
            char ch1 = '\0';
            double num1, num2, num3;
            boolean bol = false;
            String num = new String();
            for (int i = 0; i < str.length(); i++) {
                int a=1;
                ch = str.charAt(i);
                if (ch == ' ') {
                    continue;
                } else if (ch == '.') {
                    num = num + ch;
                } else if ((ch >= '0' && ch <= '9')) {
                    num = num + ch;
                    if (i + 1 != str.length()) {
                        if (str.charAt(i + 1) == '(' || str.charAt(i + 1) == ')' || str.charAt(i + 1) == '+' || str.charAt(i + 1) == '-' || str.charAt(i + 1) == '/' || str.charAt(i + 1) == '*' || str.charAt(i + 1) == '=') {
                            if (bol) {
                                bol = false;
                                dstr.push(-Double.parseDouble(num.toString()));
                                num = "";
                            } else {
                                dstr.push(Double.parseDouble(num.toString()));
                                num = "";
                            }
                        }
                    } else {
                        if (bol) {
                            bol = false;
                            dstr.push(-Double.parseDouble(num.toString()));
                        } else {
                            dstr.push(Double.parseDouble(num.toString()));
                        }
                    }
                } else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                    if (ch == '-') {
                        bol = true;
                        ch = '+';
                    }
                    if (cstr.top == null||cstr.top.data=='('||cstr.top.data==')') {
                        cstr.push(ch);
                    } else {
                        ch1 = cstr.pop();
                        if (ch1 == '*' || ch1 == '/') {
                            if (ch == '+' || ch == '-') {
                                num2 = dstr.pop();
                                num1 = dstr.pop();
                                num3 = calcul(num1, num2, ch1);
                                dstr.push(num3);
                                cstr.push(ch);
                            }
                        } else {
                            cstr.push(ch1);
                            cstr.push(ch);
                        }
                    }
                } else if (ch == '(') cstr.push(ch);
                else if (ch == ')') {
                    ch1 = cstr.pop();
                    while (ch1 != '(') {
                        num2 = dstr.pop();
                        num1 = dstr.pop();
                        num3 = calcul(num1, num2, ch1);
                        dstr.push(num3);
                        ch1 = cstr.pop();
                    }
                    ch = str.charAt(++i);
                    while ((ch >= '0' && ch <= '9')) {
                        a=0;
                        num=num+ch;
                        ch = str.charAt(++i);
                    }
                    if(a==0) {
                        num3 = Double.parseDouble(num.toString());
                        num1 = dstr.pop();
                        num2 = num1 * num3;
                        dstr.push(num2);
                    }

                    i--;

                }
            }
            while (cstr.top != null) {
                num1 = dstr.pop();
                if (!(dstr.empty())) {
                    num2 = dstr.pop();
                    ch1 = cstr.pop();
                    num3 = calcul(num1, num2, ch1);
                    dstr.push(num3);
                } else {
                    dstr.push(num1);
                    cstr.pop();
                }
            }
    }
    public String result(){
        calc();
        return Double.toString(dstr.pop());
    }
}
