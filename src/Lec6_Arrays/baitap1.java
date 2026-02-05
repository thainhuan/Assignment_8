package Lec6_Arrays;

import java.util.Scanner;

public class baitap1 {

    static int[] nhapMang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap n: ");
            a[i] = scanner.nextInt();
        }
        return a;
    }

    static void hienThi(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static int[] daoNguoc(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }
        return b;
    }

    static void hienThiSoChan(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    static int tinhTong(int[] a) {
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0 && a[i] % 5 == 0) {
                tong += a[i];
            }
        }
        return tong;
    }

    static void xepTangDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    static void xepGiamDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = nhapMang();

        System.out.print("Mang vua nhap: ");
        hienThi(arr);

        int[] dao = daoNguoc(arr);
        System.out.print("Mang dao: ");
        hienThi(dao);

        System.out.print("So chan: ");
        hienThiSoChan(arr);

        System.out.println("Tong chia het cho 3 va 5: " + tinhTong(arr));

        xepTangDan(arr);
        System.out.print("Xep tang dan: ");
        hienThi(arr);

        xepGiamDan(arr);
        System.out.print("Xep giam dan: ");
        hienThi(arr);
    }
}
