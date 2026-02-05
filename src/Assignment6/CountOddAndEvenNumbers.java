
package Assignment6;
import java.util.ArrayList;
import java.util.Random;

public class CountOddAndEvenNumbers {
    public static void main(String[]args){
    ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        int odd = 0, even = 0;

        for (int i = 0; i < 15; i++) {
            int x = rand.nextInt(50) + 1;
            numbers.add(x);

            if (x % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Danh sach: " + numbers);
        System.out.println("So chan: " + even);
        System.out.println("So le: " + odd);
    }
}
    

