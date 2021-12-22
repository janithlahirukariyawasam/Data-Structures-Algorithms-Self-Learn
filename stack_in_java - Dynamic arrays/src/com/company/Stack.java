package com.company;

public class Stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data){
        if(top < 5){
            stack[top] = data;
            top++;
        }else{
            System.out.println("Stack is full...");
        }

    }

    public void show(){
        System.out.print("Printing stack --> ");
        for(int i=0; i<5; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public void pop(){
        top--;
        if(top == -1){
            System.out.println("Error");
        }else{
            int data = stack[top];
            System.out.println("Removed " + data + " from stack.");
            stack[top] = 0;
        }


    }

    public void peek(){
        System.out.println("Peek Value " + stack[top-1]);
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top == 0;
    }
}
