package com.gyeongmin.practice3;

public class Application {
    public static void main(String[] args) {
        int answer = 0;
        String my_string = "3 + 7";
        String s = my_string.replaceAll("[^0-9]"," ");
        char[] sarr = s.toCharArray();
        for(int i = 0; i < sarr.length; i++){
            System.out.println(sarr[i]);
            if(sarr[i] != ' '){
                answer += Integer.parseInt(Integer.toString(sarr[i]));
            }
        }
        System.out.println(sarr.length);
        System.out.println(answer);
    }
}
