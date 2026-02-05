package Assignment6;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Hieu");
        names.add("Binh");
        names.add("Hieu");
        names.add("Bao");
        names.add("Binh");
        int n = names.size();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < names.size(); j++) {

                if (names.get(i).equals(names.get(j))) {
                    names.remove(j);
                    j--;
                }
            }
        }

        System.out.println(names);
    }
}
