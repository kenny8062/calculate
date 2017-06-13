package com.example.administrator.myapplication;
class Node{
    double data;
    Node nextNode;
    public Node(double data){
        this.data = data;
        this.nextNode=null;
    }
}
public class Doublestacks {
    Node top;

    public Doublestacks() {
        top = null;
    }

    public boolean empty(){
        return (top == null);
    }

    public void push(double num){
        Node term=new Node(num);
        term.nextNode=top;
        top=term;
    }
    public double peek(){
        if(empty()) throw new ArrayIndexOutOfBoundsException();
        return top.data;
    }
    public double pop(){
        double num=peek();
        top=top.nextNode;
        return num;
    }
}


