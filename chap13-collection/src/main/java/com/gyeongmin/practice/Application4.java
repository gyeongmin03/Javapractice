package com.gyeongmin.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> studentIDs = new HashSet<>();

        while (true) {
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }

            if (studentIDs.contains(input)) {
                System.out.println("이미 등록 된 ID입니다.");
            } else {
                studentIDs.add(input);
                System.out.println("ID가 추가 되었습니다.");
            }
        }

        System.out.println("모든 학생의 ID : " + studentIDs);
    }
}
