package com.gyeongmin.practice2;

import com.gyeongmin.practice2.InvalidAgeException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
        String input = scanner.nextLine();

        try {
            checkAge(input);
            System.out.println("입장하셔도 됩니다.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (DateTimeParseException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        } finally {
            scanner.close();
        }
    }

    public static void checkAge(String birthDate) throws InvalidAgeException {
        // 날짜 형식 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birth = LocalDate.parse(birthDate, formatter);
        LocalDate today = LocalDate.now();

        // 나이 계산
        int age = Period.between(birth, today).getYears();

        // 예외 발생 조건
        if (age < 20) {
            throw new InvalidAgeException("만 20세 미만은 입장 불가입니다.");
        }
    }
}
