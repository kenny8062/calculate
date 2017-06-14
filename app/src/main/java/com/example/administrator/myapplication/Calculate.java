package com.example.administrator.myapplication;

/**
 * Created by Administrator on 2017-06-12.
 */

public class Calculate {
    private String str="";
    Charstacks cstr;
    Doublestacks dstr;
    Calculate(String str){
        this.str=str;
        cstr=new Charstacks();
        dstr=new Doublestacks();
    }
    public double calcul(double num1,double num2, char res){
        if(res=='+') return num1+num2;
        else if(res=='-') return num1-num2;
        else if(res=='*') return num1*num2;
        else{return num1/num2;}
    }
    public void calc(){
        char ch='\0';
        char ch1='\0';
        double num1,num2 ,num3;
        boolean bol=false;
        String num=new String();
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch==' '){
                continue;
            }else if(ch=='.'){
                num=num+ch;
            }
            else if((ch>='0'&&ch<='9')){
                num=num+ch;
                if(i+1!=str.length()){
                    if(	str.charAt(i+1)=='(' || str.charAt(i+1)==')' || str.charAt(i+1)=='+' || str.charAt(i+1)=='-' || str.charAt(i+1)=='/' || str.charAt(i+1)=='*' || str.charAt(i+1)=='='){
                        if(bol){
                            bol = false;
                            dstr.push(-Double.parseDouble(num.toString()));
                            num="";
                        }else {
                            dstr.push(Double.parseDouble(num.toString()));
                            num = "";
                        }
                    }
                }
                else {
                    if (bol) {
                        bol = false;
                        dstr.push(-Double.parseDouble(num.toString()));
                    } else {
                        dstr.push(Double.parseDouble(num.toString()));
                    }
                }
            }
            else if(ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                if(ch=='-'){
                    bol=true;
                    ch = '+';
                }if(cstr.top==null){
                    cstr.push(ch);
                }else{
                    ch1=cstr.pop();
                    if(ch1=='*'||ch1=='/') {
                        if (ch == '+' || ch == '-') {
                            num2 = dstr.pop();
                            num1 = dstr.pop();
                            num3 = calcul(num1, num2, ch1);
                            dstr.push(num3);
                            cstr.push(ch);
                        }
                    }else{
                        cstr.push(ch1);
                        cstr.push(ch);
                    }
                }
            }else if (ch=='(') cstr.push(ch);
            else if(ch==')'){
                while(ch1!='('){
                    ch1=cstr.pop();
                    if(ch1 !='('){
                        num2=dstr.pop();
                        num1=dstr.pop();
                        num3=calcul(num1,num2,ch1);
                        dstr.push(num3);
                    }
                }
            }
        }

        while(cstr.top!=null ){
            num1=dstr.pop();
            if(!(dstr.empty())) {
                num2 = dstr.pop();
                ch1 = cstr.pop();
                num3 = calcul(num1, num2, ch1);
                dstr.push(num3);
            }else{
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
