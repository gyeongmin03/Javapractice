package com.greedy.level01.basic;

public class Calculator {

    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(){
        int num = 0;
        for(int i =  1; i <= 10; i++){
            num += i;
        }
        return num;
    }
    public void checkMaxNumber(int a, int b){
        int result = a > b ? a : b;
        System.out.println("두 수 중 큰 수는 " + result + "이다.");
    }

    public int sumTwoNumbers(int a, int b){
        int result = a + b;
        return result;
    }

    public int minusTwoNumbers(int a, int b){
        int result = a - b;
        return result;
    }
}
