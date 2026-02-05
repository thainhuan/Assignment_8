package Lec5_Loops;

import java.util.Scanner;

public class DoWhile1 {

    public class Ex1 {

        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            String phrase;
            do {
                System.out.print("Type your password: ");
                phrase = console.next();
            } while (!phrase.equals("duytan"));

        }
    }

}
