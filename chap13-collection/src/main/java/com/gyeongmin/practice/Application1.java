package com.gyeongmin.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        List<Integer> scorelist =  new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sumscore = 0;
        while(true) {
            System.out.println("학생 성적 : ");
            int score = sc.nextInt();
            scorelist.add(score);
            System.out.println("추가 입력하려면 y : ");
            char ch = sc.next().charAt(0);
            if (ch == 'n') break;
        }
        for(Integer i : scorelist) {
            sumscore += i;
        }
        System.out.println("학생 인원 : " + scorelist.size());
        System.out.println("평균 점수 : " + (double) (sumscore/scorelist.size()));
    }

}
