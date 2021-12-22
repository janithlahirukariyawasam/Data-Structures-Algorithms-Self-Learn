package com.company;

public class Stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data){
        stack[top] = data;
        top++;
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
        int data = stack[top];
        System.out.println("Removed " + data + " from stack.");
        stack[top] = 0;

    }

    public void peek(){
        System.out.println("Peek Value " + stack[top-1]);
    }
}
