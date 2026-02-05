package Assignment6;

import java.util.ArrayList;

public class IterateThroughAnArrayList {

    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(10.5);
        prices.add(20.0);
        prices.add(15.75);

        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i));
        }
    }
}
