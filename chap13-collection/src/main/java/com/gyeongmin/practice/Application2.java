package com.gyeongmin.practice;

import java.util.Scanner;
import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> url = new Stack<>();

        while(true) {
            System.out.println("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            String surl  = sc.nextLine();
            if(surl.equals("exit")) break;
            url.push(surl);
        }
        for(int i = 0; i < 5; i++) {
            System.out.println(url.peek());
            url.pop();
        }
    }
}
