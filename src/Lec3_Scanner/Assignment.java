/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec3_Scanner;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Assignment {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap ho va ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("MSSV: ");
        int studenID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap que quan: ");
        String hometown = scanner.nextLine();
        System.out.print("Nhap GPA: ");
        float gpa = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Nhap chuyen nganh: ");
        String major = scanner.nextLine();
        System.out.print("Co hoc bong khong: ");
        boolean scholarship = scanner.nextBoolean();
        scanner.nextLine();
       
        System.out.println("Ho va ten: "+hoTen 
                +"\nMSSV: "+ studenID 
                +"\nQue quan: "+hometown 
                +"\nGPA: " +gpa 
                + "\nChuyen nganh: "+major 
                +"\nHoc bong: "+scholarship );
       
    }
                
    
}
