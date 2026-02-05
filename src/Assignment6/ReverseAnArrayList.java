package Assignment6;

import java.util.ArrayList;

public class ReverseAnArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int n = list.size();

        for (int i = 0; i < n / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(n - 1 - i));
            list.set(n - 1 - i, temp);
        }

        System.out.println(list);

    }
}
