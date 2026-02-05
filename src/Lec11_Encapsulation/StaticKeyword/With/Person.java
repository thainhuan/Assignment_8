package Lec11_Encapsulation.StaticKeyword.With;

public class Person {

    private String name;
    private static int count = 0;

    public Person(String n) {
        name = n;
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Nhuan");
        Person p2 = new Person("Hieu");
        Person p3 = new Person("Khanh");
    }
}
