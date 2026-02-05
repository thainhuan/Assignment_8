package Lec5_Loops;


import java.util.Random;
import java.util.Scanner;

public class Random6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int soBiMat = rand.nextInt(100) + 1;
        int soNhap;
        do {
            System.out.print(" Nhap so ban doan: ");
            soNhap = scanner.nextInt();

            if (soNhap < soBiMat) {
                System.out.println("Lon hon");
            } else if (soNhap > soBiMat) {
                System.out.println("Nho hon");
            } else {
                System.out.println(" Chuc mung!");
            }
        } while (soNhap != soBiMat);
    }
}
