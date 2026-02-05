/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec4_ConditionalExcution;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Excution2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What percentage did you earn?");
        int percent = scanner.nextInt();
        if(percent>=90){
        System.out.println("You got an A!");
        }
        else if (percent >= 80  ){
            System.out.println("You got an B!");  
        }
        else if (percent >= 70  ){
            System.out.println("You got an C!"); 
        }
        else if (percent >= 60  ){
            System.out.println("You got an D!"); 
        }
        if (percent < 60 ){
            System.out.println("You got an F!"); 
        }
    }
    
    
}
