package Assignment6;

import java.util.ArrayList;
import java.util.Random;

public class MaxMinRandom {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100) + 1);
        }

        int max = numbers.get(0);
        int min = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {

            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }

            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }

        System.out.println("Danh sach: " + numbers);
        System.out.println("So lon nhat: " + max);
        System.out.println("So nho nhat: " + min);
    }
}
