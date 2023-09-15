package com.lissenok88.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите необходимую ковбою сумму и колличество номиналов купюр: ");
        String[] amountRequiredAndNumberDenominations = scanner.nextLine().split(" ");
        int amountRequired = Integer.parseInt(amountRequiredAndNumberDenominations[0]);
        int numberDenominations = Integer.parseInt(amountRequiredAndNumberDenominations[1]);

        int[] denominations = new int[numberDenominations * 2];
        System.out.print("Введите номиналы: ");
        String[] denominationsStr = scanner.nextLine().split(" ");
        int i = 0;
        int j = 0;
        while (i < (numberDenominations * 2) && j < numberDenominations) {
            denominations[i] = Integer.parseInt(denominationsStr[j]);
            i++;
            denominations[i] = Integer.parseInt(denominationsStr[j]);
            i++;
            j++;
        }

        isStole(amountRequired, denominations);
        scanner.close();
    }

    public static boolean isStole(int amountRequired, int[] denominations) {
        Arrays.sort(denominations);
        List<Integer> stolenDollars = new ArrayList<>();
        int sum = 0;
        int count = 0;

        for (int a = denominations.length - 1; a >= 0; a--) {
            if (sum < amountRequired) {
                if (sum + denominations[a] == amountRequired) {
                    stolenDollars.add(denominations[a]);
                    sum += denominations[a];
                    count++;
                    break;
                }
                if (sum + denominations[a] < amountRequired) {
                    stolenDollars.add(denominations[a]);
                    sum += denominations[a];
                    count++;
                }
            }
        }

        if(sum < amountRequired) {
            printResult(-1, stolenDollars);
            return false;
        } else {
            printResult(count, stolenDollars);
            return true;
        }
    }

    private static void printResult(int count, List<Integer> stolenDollars) {
        if(count == -1) {
            System.out.println(-1);
        } else {
            System.out.println(count);
            for(int i = stolenDollars.size() - 1; i >= 0; i--) {
                System.out.print(stolenDollars.get(i));
                if(i > 0) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
