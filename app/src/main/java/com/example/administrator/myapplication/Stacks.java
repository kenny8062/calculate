package com.example.administrator.myapplication; /**
 * Created by Administrator on 2017-05-31.
 */
import java.util.*;
public class Stacks {
    private int top;
    private int maxSize;
    private char[] stackArray;
    // 배열 스택 생성,  스택의 최대 크기로 생성
    public Stacks(int maxSize){
        this.maxSize = maxSize;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }
    // 스택이 비어있는지 체크
    public boolean empty(){
        return (top == -1);
    }
    // 스택이 꽉찼는지 체크
    public boolean full(){
        return (top == maxSize-1);
    }
    public void push(char num){
        if(full()) System.out.println("최대치를 넘었습니다"); return;
        stackArray[++top] = num;
    }
    public char peek(){
        if(empty()) System.out.println("들어있는 값이 하나도 없습니다");
        return stackArray[top];
    }
    // 스택의 가장 위의 데이터 제거
    public Object pop(){
        char item = peek();
        top--;
        return item;
    }
}


