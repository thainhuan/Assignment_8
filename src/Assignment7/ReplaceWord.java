package Assignment7;

import java.util.Scanner;

class ReplaceWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine();

        System.out.print("Tu cu: ");
        String oldWord = scanner.nextLine();

        System.out.print("Tu moi: ");
        String newWord = scanner.nextLine();

        System.out.println("Tu sau khi thay: " + s.replace(oldWord, newWord));
    }
}
