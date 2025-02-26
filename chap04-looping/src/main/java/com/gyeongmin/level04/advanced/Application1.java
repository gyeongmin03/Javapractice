package com.gyeongmin.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력 받기
        System.out.print("문자열을 입력하세요 : ");
        String input = scanner.nextLine();

        // 숫자 입력 받기
        System.out.print("숫자를 입력하세요 : ");
        int shift = scanner.nextInt();

        // 27인 경우 1로 변경
        if (shift >= 27) {
            shift = 1;
        }

        // 암호문 생성
        StringBuilder encrypted = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                // 알파벳을 밀기
                char encryptedChar = (char) ((c - base + shift) % 26 + base);
                encrypted.append(encryptedChar);
            } else {
                // 공백 및 기타 문자는 그대로 추가
                encrypted.append(c);
            }
        }

        // 결과 출력
        System.out.println("암호문 : " + encrypted.toString());
    }
}