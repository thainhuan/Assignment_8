package Lec6_Arrays;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap kich thuoc mang: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu: " + i + ": ");
            mang[i] = scanner.nextInt();
        }
        System.out.println("cac phan tu trong mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] +" ");
        
    

        }
    }
    
}
