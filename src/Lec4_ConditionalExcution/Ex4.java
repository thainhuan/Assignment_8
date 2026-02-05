
package Lec4_ConditionalExcution;
import java.util.Scanner;

public class Ex4 {
    public static int quadrant(double x,double y){
        if( x>0 && y>0 ){
            return 1;
        }
        else if( x<0 && y>0 ){
            return 2;
        }
        else if( x<0 && y<0 ){
            return 3;
        }
        else if( x>0 && y<0){
            return 4;
        }
        else{
            return 0;
        }
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter x: ");
        double x = scanner.nextDouble();
        System.out.print("enter y: ");
        double y = scanner.nextDouble();
        System.out.println("quadrant :"+ quadrant(x,y));
        
    }
}
