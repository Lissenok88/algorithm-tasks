package com.lissenok88.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение n: ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите последовательность Джо через пробел:");
        String[] a = scanner.nextLine().split(" ");
        int[] joeSequence = new int[n];
        for (int i = 0; i < n; i++) {
            joeSequence[i] = Integer.parseInt(a[i]);
        }

        System.out.println("Введите выигрышную последовательность через пробел:");
        String[] b = scanner.nextLine().split(" ");
        int[] winningSequence = new int[n];
        for (int i = 0; i < n; i++) {
            winningSequence[i] = Integer.parseInt(b[i]);
        }

        System.out.println(isWinningSequence(joeSequence, winningSequence));
        scanner.close();
    }

    public static String isWinningSequence(int[] joeSequence, int[] winningSequence) {
        Arrays.sort(joeSequence);
        Arrays.sort(winningSequence);

        return (Arrays.equals(joeSequence, winningSequence)) ? "YES" : "NO";
    }
}
