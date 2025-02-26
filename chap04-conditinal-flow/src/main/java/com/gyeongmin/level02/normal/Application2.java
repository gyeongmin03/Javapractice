package com.gyeongmin.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("체중을 입력해주세요 : ");
        int kg =  sc.nextInt();
        System.out.println("신장을 입력해주세요 : ");
        double m = sc.nextDouble();

        double bmi = (double) kg / (m * m);

        if(bmi >= 30){
            System.out.println("당신은 비만입니다.");
        }else if(bmi >= 25){
            System.out.println("당신은 과체중입니다.");
        }else if(bmi >= 20) {
            System.out.println("당신은 정상체중입니다.");
        } else{
            System.out.println("당신은 저체중입니다.");
        }
    }
}