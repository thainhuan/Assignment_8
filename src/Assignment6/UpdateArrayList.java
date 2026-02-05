package Assignment6;

import java.util.ArrayList;

public class UpdateArrayList {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("White");
        colors.add("Black");

        colors.set(1, "Yellow");
        System.out.println(colors);
    }
}
