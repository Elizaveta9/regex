package com.company;

import java.util.Scanner;

public class regex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isCorrect = false;
        while (!isCorrect) {
            System.out.print("Введите ip-адресс >> ");
            String address = scan.nextLine();
            isCorrect = address.matches("(([01]?(\\d){1,2})|(2[0-4]\\d)|(25[0-5]))(\\.(([01]?(\\d){1,2})|(2[0-4]\\d)|(25[0-5]))){3}");
            System.out.println(isCorrect ? "Адресс принят." : "Адресс введён некорректно. Повторите попытку.");
        }
    }
}
