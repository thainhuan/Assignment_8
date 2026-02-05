

import java.util.Scanner;

public class Excution3 {
    public static int findMaxNumber(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
       public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
           System.out.print("nhap so thu nhat: ");
           int a = scanner.nextInt();
           System.out.print("nhap so thu hai: ");
           int b = scanner.nextInt();
           
           System.out.print("so lon hon la: "+findMaxNumber(a,b));
           
       }
}

