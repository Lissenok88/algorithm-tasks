package com.lissenok88.tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String s = "sheriff";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку символов: ");
        String string = scanner.nextLine();

        System.out.println(maxWordCount(s, string));

        scanner.close();
    }

    public static int maxWordCount(String s, String string) {
        boolean contain = true;
        String equalsString = "";
        int count = 0;
        while (contain) {
            for (int i = 0; i < s.length(); i++) {
                String ch = String.valueOf(s.charAt(i));
                if (string.contains(ch)) {
                    string = string.substring(0, string.indexOf(ch)) + string.substring(string.indexOf(ch) + 1);
                    equalsString = equalsString + ch;
                }
            }
            if (s.equals(equalsString)) {
                count++;
                equalsString = "";
            } else contain = false;
        }
        return count;
    }
}
