package com.gyeongmin.practice1;

import java.awt.print.Book;

public class Application {
    public static void main(String[] args) {
        BookDTO bk1 = new BookDTO();
        System.out.println(bk1);

        BookDTO bk2 = new BookDTO("자바의 정석","도우출판", "남궁성");
        System.out.println(bk2);

        BookDTO bk3 = new BookDTO("홍길동전","활빈당", "허균", 5000000, 0.5);
        System.out.println(bk3);
    }
}
