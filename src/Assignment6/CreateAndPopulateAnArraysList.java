package Assignment6;

import java.util.ArrayList;

public class CreateAndPopulateAnArraysList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);

        }
        System.out.println("Numbers from 1 to 10: ");
        System.out.println(numbers);

    }

}
