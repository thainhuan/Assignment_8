package Lec5_Loops;

public class nested3 {

    public static void main(String[] arqs) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("i");
            }
            System.out.println();
        }
    }

}
