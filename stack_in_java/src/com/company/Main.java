package com.company;

public class Main {

    public static void main(String[] args) {
        Stack nums = new Stack();
        System.out.println(nums.isEmpty());
        nums.push(2);
        nums.push(5);
        nums.push(6);
        nums.push(10);
        System.out.println(nums.isEmpty());
        nums.show();
        nums.pop();
        nums.show();
        nums.peek();

    }
}
