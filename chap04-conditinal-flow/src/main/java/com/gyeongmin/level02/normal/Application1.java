package com.gyeongmin.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : ");
        int num = sc.nextInt();

        if(num < 1 || num > 10) {
            System.out.println("1~10사이의 정수를 입력해주세요.");
        }
        else{
            if(num % 2 == 0) System.out.println("짝수다");
            else System.out.println("홀수다");
        }
    }
}
