package Lec5_Loops;
import java.util.Random;
import java.util.Scanner;
public class Random5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int soNgauNhien = rand.nextInt(10) + 1;
        int soNhap, soLanNhap = 0;
        do {
            System.out.print(" Nhap so (1-10): ");
            soNhap = scanner.nextInt();
            soLanNhap++;
        } while (soNhap != soNgauNhien);
        System.out.println(" Dung!");
        System.out.println(" So lan nhap: " + soLanNhap);
    }
}
