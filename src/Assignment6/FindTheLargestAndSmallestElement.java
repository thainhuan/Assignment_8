package Assignment6;

import java.util.ArrayList;

public class FindTheLargestAndSmallestElement {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(30);
        numbers.add(2);
        numbers.add(18);

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

        System.out.println("So lon nhat: " + max);
        System.out.println("So nho nhat: " + min);
    }
}
