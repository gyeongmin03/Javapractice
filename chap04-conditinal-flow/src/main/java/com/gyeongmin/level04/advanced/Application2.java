package com.gyeongmin.level04.advanced;

import java.util.Scanner;

public class Application2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("월 급여 입력 : ");
            int salary = sc.nextInt();
            System.out.println("매출액 입력 : ");
            int money = sc.nextInt();

            int bonus = 0;
            if(money >= 50000000){
                bonus = 5;
            }
            else if(money >= 30000000){
                bonus = 3;
            }
            else if(money >= 10000000){
                bonus = 1;
            }
            System.out.println("매출액 : " + money);
            System.out.println("보너스율 : " + bonus);
            System.out.println("월 급여 : " + salary);
            System.out.println("보너스 금액 : " + money /100 *(bonus));
            System.out.println("총 급여 : " + (salary + (money /100 *(bonus))));
    }
}
