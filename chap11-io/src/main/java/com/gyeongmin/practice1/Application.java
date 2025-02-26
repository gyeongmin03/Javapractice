package com.gyeongmin.practice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("파일 이름을 입력하세요 : ");
        String fileName = scanner.nextLine();

        // 파일 읽기 시도
        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
        } finally {
            scanner.close();
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);

        System.out.println("\n===== 파일 내용 출력 =====");
        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }

        fileScanner.close();
    }
}
