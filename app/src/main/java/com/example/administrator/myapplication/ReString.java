package com.example.administrator.myapplication;

/**
 * Created by Administrator on 2017-06-26.
 */

public class ReString {
    private double[] num = new double[100];
    private String str = new String();
    private String str2 = new String();
    private String string2 = new String();
    char[] arr;
    char[] arr2 =new char[100];
    ReString(String _str){
        str=_str;
    }
    public String getString(){
        return str2;
    }
    public void setplusString(String _str){
        str2=str2+_str;
    }
    public String tostring(){
        int a=0;
        str2 = "";
        arr = str.toCharArray();
        for (int i = 0; i < 100; i++) num[i] = 0;
        for (int i = 0; i < 100; i++) arr2[i] = '0';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '+') {
                for (int j = 0; j < 100; j++) {
                    if (arr2[j] == '0') {
                        arr2[j] = '+';
                        break;
                    }
                }
                for (int j = a; j < i; j++) {
                    string2 = string2 + arr[j];
                }
                a = i + 1;

                for (int j = 0; j < 100; j++) {
                    if (string2.equals("")) break;
                    if (num[j] == 0) {
                        num[j] = Double.parseDouble(string2);
                        string2 = "";
                        break;
                    }
                }
            } else if (arr[i] == '-') {
                for (int j = 0; j < 100; j++) {
                    if (arr2[j] == '0') {
                        arr2[j] = '-';
                        break;
                    }
                }
                for (int j = a; j < i; j++) {
                    string2 = string2 + arr[j];
                }
                a = i + 1;
                for (int j = 0; j < 100; j++) {
                    if (string2.equals("")) break;
                    if (num[j] == 0) {
                        num[j] = Double.parseDouble(string2);
                        string2 = "";
                        break;
                    }
                }
            } else if (arr[i] == '*') {
                for (int j = 0; j < 100; j++) {
                    if (arr2[j] == '0') {
                        arr2[j] = '*';
                        break;
                    }
                }
                for (int j = a; j < i; j++) {
                    string2 = string2 + arr[j];
                }
                a = i + 1;
                for (int j = 0; j < 100; j++) {
                    if (string2.equals("")) break;
                    if (num[j] == 0) {
                        num[j] = Double.parseDouble(string2);
                        string2 = "";
                        break;
                    }
                }
            } else if (arr[i] == '/') {
                for (int j = 0; j < 100; j++) {
                    if (arr2[j] == '0') {
                        arr2[j] = '/';
                        break;
                    }
                }
                for (int j = a; j < i; j++) {
                    string2 = string2 + arr[j];
                }
                a = i + 1;
                for (int j = 0; j < 100; j++) {
                    if (string2.equals("")) break;
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
                i = a - 1;
                for (int j = 0; j < 100; j++) {
                    if (string2.equals("")) break;
                    if (num[j] == 0) {
                        num[j] = Math.round(Math.cbrt(Double.parseDouble(string2)) * 10) / 10.0;
                        string2 = "";
                        break;
                    }
                }
            } else if (arr[i] == '^' && arr[i + 1] == '(') {
                double _num;
                double _num2;
                for (int j = a; j < i; j++) {
                    string2 = string2 + arr[j];
                }
                _num = Double.parseDouble(string2);
                string2 = "";
                for (int j = i + 2; arr[j] != ')'; j++) {
                    string2 = string2 + arr[j];
                    a = j + 2;
                }
                _num2 = Double.parseDouble(string2);
                for (int j = 0; j < 100; j++) {
                    if (string2.equals("")) break;
                    if (num[j] == 0) {
                        num[j] = Math.pow(_num, _num2);
                        string2 = "";
                        break;
                    }
                }
            } else if (arr[i] == 'r' && arr[i + 1] == '(') {
                for (int j = i + 2; arr[j] != ')'; j++) {
                    string2 = string2 + arr[j];
                    a = j + 2;
                }
                i = a - 1;
                for (int j = 0; j < 100; j++) {
                    if (string2.equals("")) break;
                    if (num[j] == 0) {
                        num[j] = Math.round(Math.sqrt(Double.parseDouble(string2)) * 10) / 10.0;
                        string2 = "";
                        break;
                    }
                }
            } else if (arr[i] == 't' && arr[i + 1] == 'a') {
                for (int j = i + 4; arr[j] != ')'; j++) {
                    string2 = string2 + arr[j];
                    a = j + 2;
                }
                i = a - 1;
                for (int j = 0; j < 100; j++) {
                    if (string2.equals("")) break;
                    if (num[j] == 0) {
                        num[j] = Math.round(Math.tan(Double.parseDouble(string2)) * 10) / 10.0;
                        string2 = "";
                        break;
                    }
                }
            } else if (arr[i] == 'c' && arr[i + 1] == 'o') {
                for (int j = i + 4; arr[j] != ')'; j++) {
                    string2 = string2 + arr[j];
                    a = j + 2;
                }
                i = a - 1;
                for (int j = 0; j < 100; j++) {
                    if (string2.equals("")) break;
                    if (num[j] == 0) {
                        num[j] = Math.round(Math.cos(Double.parseDouble(string2)) * 10) / 10.0;
                        string2 = "";
                        break;
                    }
                }
            } else if (arr[i] == 's' && arr[i + 1] == 'i') {
                for (int j = i + 4; arr[j] != ')'; j++) {
                    string2 = string2 + arr[j];
                    a = j + 2;
                }
                i = a - 1;
                for (int j = 0; j < 100; j++) {
                    if (string2.equals("")) break;
                    if (num[j] == 0) {
                        num[j] = Math.round(Math.sin(Double.parseDouble(string2)) * 10) / 10.0;
                        string2 = "";
                        break;
                    }
                }
            } else if (arr[i] == 'l' && arr[i + 1] == 'n') {
                for (int j = i + 3; arr[j] != ')'; j++) {
                    string2 = string2 + arr[j];
                    a = j + 2;
                }
                i = a - 1;
                for (int j = 0; j < 100; j++) {
                    if (string2.equals("")) break;
                    if (num[j] == 0) {
                        num[j] = Math.round(Math.log(Double.parseDouble(string2)) * 10) / 10.0;
                        string2 = "";
                        break;
                    }
                }
            } else if (arr[i] == 'l' && arr[i + 1] == 'o') {
                for (int j = i + 4; arr[j] != ')'; j++) {
                    string2 = string2 + arr[j];
                    a = j + 2;
                }
                i = a - 1;
                for (int j = 0; j < 100; j++) {
                    if (string2.equals("")) break;
                    if (num[j] == 0) {
                        num[j] = Math.round(Math.log10(Double.parseDouble(string2)) * 10) / 10.0;
                        string2 = "";
                        break;
                    }
                }
            } else if (arr[i] == '(') {
                int count=0;
                if(arr[i-1]>='0'&&arr[i-1]<='9') {
                    while(arr[i-1]>='0'&&arr[i-1]<='9'){
                        i--;
                        count++;
                    }
                    for(int o=i;arr[o]!='(';o++) {
                        string2 = string2 + arr[o];
                        for (int j = 0; j < 100; j++) {
                            if (string2.equals("")) break;
                            if (num[j] == 0) {
                                num[j] = Double.parseDouble(string2);
                                string2 = "";
                                break;
                            }
                        }
                    }
                    i+=count;
                    for (int j = 0; j < 100; j++) {
                        if (arr2[j] == '0') {
                            arr2[j] = '*';
                            arr2[j+1] = '(';
                            break;
                        }
                    }
                    a = i + 1;
                }else{
                        for (int j = 0; j < 100; j++) {
                            if (arr2[j] == '0') {
                                arr2[j] = '(';
                                break;
                            }
                        }
                    a = i + 1;
                    }
            } else if (arr[i] == ')') {
                for (int j = a; j < i; j++) {
                    string2 = string2 + arr[j];
                }
                for (int j = 0; j < 100; j++) {
                    if (string2.equals("")) break;
                    if (num[j] == 0) {
                        num[j] = Double.parseDouble(string2);
                        string2 = "";
                        break;
                    }
                }
                for (int j = 0; j < 100; j++) {
                    if (arr2[j] == '0') {
                        arr2[j] = ')';
                        break;
                    }
                }
                a = i + 1;
            }
            if (arr[i] == '=') {
                for (int j = a; j < i; j++) {
                    string2 = string2 + arr[j];
                }
                for (int j = 0; j < 100; j++) {
                    if (string2.equals("")) break;
                    if (num[j] == 0) {
                        num[j] = Double.parseDouble(string2);
                        string2 = "";
                        break;
                    }
                }
                break;
            }
        }
        int i = 0;
        int j = 0;
        while (num[j] != 0 && arr2[i] != '0') {
            if (arr2[i] == '(') {
                str2 = str2 + '(';
                i++;
                while (arr2[i] != ')') {
                    str2 = str2 + Double.toString(num[j++]);
                    str2 = str2 + arr2[i++];
                    if(arr2[i]=='(') {
                        str2 = str2 + '(';
                        i++;
                    }
                }
                str2 = str2 + Double.toString(num[j++]);
                str2 = str2 + arr2[i++];
                if (arr2[i] != '0') str2 = str2 + arr2[i++];
            } else {
                str2 = str2 + Double.toString(num[j++]);
                str2 = str2 + arr2[i++];
            }
        }
        if (num[j] != 0) str2 = str2 + Double.toString(num[j++]);
        return str2;
    }
}
