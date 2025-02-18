package com.greedy.level01.basic;

import com.greedy.level01.basic.Calculator;
import static com.greedy.level01.basic.Calculator.*;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.checkMethod();
        System.out.println("1부터 10까지의 합 : " + calculator.sum1to10());
        calculator.checkMaxNumber(10,20);
        System.out.println("10과 20의 합은 : " + calculator.sumTwoNumbers(10,20));
        System.out.println("10과 5의 차는 : " + calculator.minusTwoNumbers(10, 5));

    }

}
