package Lec6_Arrayslits;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap ten sinh vien: ");
            names.add(scanner.nextLine());
            System.out.println("Danh sach sinh vien: ");
            for (String name : names) {
                System.out.println(name);
            }
        }

    }

}
