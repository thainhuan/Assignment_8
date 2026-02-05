package Lec5_Loops;

import java.util.Random;

public class Random1 {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        System.out.println("so ngau nhien la: " + n);
    }
}
