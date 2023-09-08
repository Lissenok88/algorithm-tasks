package com.lissenok88.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите через пробел колличество револьверов и сколько долларов есть у ковбоя: ");
        String[] revolversAndDollars = scanner.nextLine().split(" ");
        int revolvers = Integer.parseInt(revolversAndDollars[0]);
        int dollars = Integer.parseInt(revolversAndDollars[1]);

        int[] revolverPrices = new int[revolvers];
        System.out.print("Введите цены пистолетов через пробел: ");
        String[] prices = scanner.nextLine().split(" ");
        for(int i = 0; i < revolvers; i++) {
            revolverPrices[i] = Integer.parseInt(prices[i]);
        }

        System.out.println(searchMaxPrice(revolvers, dollars, revolverPrices));
        scanner.close();
    }

    public static int searchMaxPrice(int revolvers, int dollars, int[] revolverPrices) {
        Arrays.sort(revolverPrices);
        int maxPrice = 0;
        for(int a = revolvers - 1; a >= 0;  a--) {
            if(revolverPrices[a] <= dollars) {
                maxPrice = revolverPrices[a];
                break;
            }
        }
        return maxPrice;
    }
}
