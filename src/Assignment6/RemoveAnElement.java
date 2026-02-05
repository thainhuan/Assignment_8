package Assignment6;

import java.util.ArrayList;
import java.util.Random;

public class RemoveAnElement {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100) + 1);
        }

        numbers.remove(3);
        System.out.println(numbers);
    }
}
