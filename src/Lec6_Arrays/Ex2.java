package Lec6_Arrays;

import java.util.Scanner;
import java.util.*;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many days' temperatures? ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            a[i] = scanner.nextInt();
            sum += a[i];
        }

        double average = (double) sum / n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > average) {
                count++;
            }
        }

        System.out.printf("Average temp = %.1f%n", average);
        System.out.println(count + " days were above average.");
        System.out.println("Temperatures: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Two coldest days: " + a[0] + ", " + a[1]);
        System.out.println("Two hottest days: " + a[a.length - 1] + ", " + a[a.length - 2]);

    }
}
