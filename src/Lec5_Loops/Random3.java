package Lec5_Loops;

import java.util.Random;

public class Random3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(80 - 3 + 1) + 3;
        System.out.println("So ngau nhien: " + n);
        if (n % 2 == 0) {
            System.out.println(n + " la so chan ");
        } else {
            System.out.println(n + " la so le ");
        }
    }

}
