package Assignment6;

import java.util.ArrayList;

public class CopyAnArrayList {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");

        ArrayList<String> copy = new ArrayList<>(fruits);

        System.out.println("Danh sach goc: " + fruits);
        System.out.println("Danh sach sao chep: " + copy);
    }

}
