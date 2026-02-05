package Lec6_Arrays;

public class Arr1 {

    public static void main(String[] args) {

        int[] numbers = new int[8];
        for (int i = 0; i < 8; i++) {
            numbers[i] = 2 * i;

        }
        for (int i = 0; i < 8; i++) {
            System.out.println("numbers(" + i + ")=" + numbers[i]);
        }
    }

}
