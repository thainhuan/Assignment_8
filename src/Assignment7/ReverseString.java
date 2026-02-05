package Assignment7;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine();
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
    }

}
