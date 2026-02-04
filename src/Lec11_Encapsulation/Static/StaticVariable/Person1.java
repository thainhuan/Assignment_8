
package Lec11_Encapsulation.Static.StaticVariable;

public class Person1 {

    private String name;
    private static int count = 0;

    public Person1(String n) {
        name = n;
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {

        Person1 p1 = new Person1("Trang");
        Person1 p2 = new Person1("Duong");
        Person1 p3 = new Person1("Luong");
    }
}
