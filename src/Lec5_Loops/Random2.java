package Lec5_Loops;

import java.util.Random;

public class Random2 {

    public static void main(String[] args) {
        Random rand = new Random();

        double randomNumber = rand.nextDouble() * (8.0 - 1.8) + 1.8;

        System.out.println("so ngau nhien : " + randomNumber);
    }
}
