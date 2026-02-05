package Assignment7;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        System.out.println("So tu: " + words.length);
    }
}
