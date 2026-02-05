package Lec5_Loops;

import java.util.Scanner;

public class While2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number (-1 to quit):");
        int number = console.nextInt();
        while (number != -1) {
            sum = sum + number;
            System.out.print("Enter a number(-1 to quit):");
            number = console.nextInt();
        }
        System.out.println("The total is " + sum);
    }

}
