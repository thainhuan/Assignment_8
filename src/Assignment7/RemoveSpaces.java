package Assignment7;

import java.util.Scanner;

public class RemoveSpaces {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine();

        s = s.trim().replaceAll(" +", " ");
        System.out.print("Chuoi sau xoa: ");
        System.out.println(s);
    }
}
