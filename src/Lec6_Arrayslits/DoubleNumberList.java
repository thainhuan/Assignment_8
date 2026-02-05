package Lec6_Arrayslits;

import java.util.ArrayList;
import java.util.Scanner;

public class DoubleNumberList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            System.out.print("Nhap so thuc thu  : ");
            numbers.add(sc.nextDouble());
        }

        System.out.println("Cac so da nhap:");
        for (double x : numbers) {
            System.out.println(x);
        }
    }
}
