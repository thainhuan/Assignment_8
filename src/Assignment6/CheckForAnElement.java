package Assignment6;

import java.util.ArrayList;

public class CheckForAnElement {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Berlin");
        cities.add("New York");

        System.out.println(cities.contains("London"));
    }
}
