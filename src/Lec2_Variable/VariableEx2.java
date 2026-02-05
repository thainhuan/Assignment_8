/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec2_Variable;

/**
 *
 * @author Admin
 */
public class VariableEx2 {
   public static void main(String[] arqs) {
        int x = 1;
        int y = x++ + x-- +--x + x++ + x++ - x;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
    
}
