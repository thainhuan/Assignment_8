package Assignment7;

import java.util.Scanner;

public class CountChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine();

        System.out.print("Nhap ky tu: ");
        char c = scanner.next().charAt(0);

        int dem = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                dem++;
            }
        }

        System.out.println("So lan xuat hien: " + dem);
    }
}
