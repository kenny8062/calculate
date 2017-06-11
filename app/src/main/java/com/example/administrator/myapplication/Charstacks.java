package com.example.administrator.myapplication;

class Nodec{
    char data;
    Nodec nextNode;
    public Nodec(char data){
        this.data = data;
        this.nextNode=null;
    }
}
public class Charstacks {
    Nodec top;

    public Charstacks(){
        top =null;
    }

    public boolean empty(){
        return (top == null);
    }

    public void push(char num){
        Nodec term=new Nodec(num);
        term.nextNode=top;
        top=term;
    }
    public char peek(){
        if(empty()) throw new ArrayIndexOutOfBoundsException();
        return top.data;
    }
    public char pop(){
        char num=peek();
        top=top.nextNode;
        return num;
    }
}

