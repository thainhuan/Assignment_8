package Lec5_Loops;


import java.util.Scanner;
import java.util.Random;

public class Random4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Nhap so thuc: ");
        double soNhap = scanner.nextDouble();

        double random = 1.0 + rand.nextDouble() * 99.0;

        System.out.println("So ngau nhien: " + random);

        if (soNhap > random) {
            System.out.println("Lon hon");
        } else if (soNhap < random) {
            System.out.println("Nho hon");
        } else {
            System.out.println("Bang");
        }
    }
}
