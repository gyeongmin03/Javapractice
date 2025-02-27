package com.gyeongmin.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> customor = new LinkedList<>();

        while(true){
            System.out.println("대기 고객 이름 입력(다음 고객으로 넘어가려면 'next', 종료하려면 'exit') : ");
            String str = sc.nextLine();
            customor.offer(str);
            if(str.equals("next") ==  false && str.equals("exit") ==  false){
                System.out.println(str + " 고객님 대기 등록 되었습니다.");
            }
            else if(customor.peek().equals("next")){
                System.out.println("대기 고객이 없습니다.");
                customor.poll();
            }
            else if(str.equals("next")){
                System.out.println(customor.peek() + "고객님 차례입니다.");
                customor.poll();
            }
            else if(str.equals("exit")){
                break;
            }

        }

    }
}
