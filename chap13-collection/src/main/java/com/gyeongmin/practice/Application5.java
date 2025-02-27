package com.gyeongmin.practice;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set =  new TreeSet<>();

        while (true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료) : ");
            String input = sc.nextLine();

            if (input.equals("exit")) break;
            else  set.add(input);
        }
        System.out.println(set);
    }
}
