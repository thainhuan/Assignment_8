/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_ConditionalExcution;
import java.util.Scanner;
public class Excution1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What percentage did you earn?");
        int percent = scanner.nextInt();
        if(percent>=90){
        System.out.println("You got an A!");
        }
        if (percent >= 80 && percent < 90 ){
            System.out.println("You got an B!");  
        }
        if (percent >= 70 && percent < 80 ){
            System.out.println("You got an C!"); 
        }
        if (percent >= 60 && percent < 70 ){
            System.out.println("You got an D!"); 
        }
        if (percent < 60 ){
            System.out.println("You got an F!"); 
        }
    }
}
