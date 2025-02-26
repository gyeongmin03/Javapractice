package com.gyeongmin.practice2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Application{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원본 파일의 이름을 입력하세요 : ");
        String sourceFileName = scanner.nextLine();

        System.out.print("복사 파일의 이름을 입력하세요 : ");
        String destinationFileName = scanner.nextLine();

        try {
            copyFile(sourceFileName, destinationFileName);
            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("오류 : " + sourceFileName + " (지정된 파일을 찾을 수 없습니다)");
        } finally {
            scanner.close();
        }
    }

    public static void copyFile(String sourceFileName, String destinationFileName) throws FileNotFoundException {
        File sourceFile = new File(sourceFileName);
        if (!sourceFile.exists()) {
            throw new FileNotFoundException();
        }

        Scanner fileScanner = new Scanner(sourceFile);
        PrintWriter writer = new PrintWriter(destinationFileName);

        while (fileScanner.hasNextLine()) {
            writer.println(fileScanner.nextLine());
        }

        fileScanner.close();
        writer.close();
    }
}
