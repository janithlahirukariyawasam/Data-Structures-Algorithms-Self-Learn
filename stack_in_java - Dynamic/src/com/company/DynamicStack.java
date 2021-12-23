package com.company;

public class DynamicStack {

    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data){
        if(size() == capacity){
            expand();
        }else {}


        stack[top] = data;
        top++;
    }

    private void expand() {
        int length = size();
        int newStack[] = new int[capacity*2];
        System.arraycopy(stack,0,newStack,0, length);
        stack = newStack;
        capacity = capacity * 2;
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