package com.gyeongmin;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String result = "";
        for (String word : words) {
            result += word.substring(0,1).toUpperCase() +  word.substring(1,word.length()) +  " ";
        }

        System.out.println("반환된 문자열 : " + result);
        System.out.println("총 단어 개수: " + words.length);

    }
}
