package Lec11_Encapsulation.StaticKeyword.Without;

public class Person {

    private String name;
    private int count = 0;

    public Person(String n) {
        name = n;
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Nhuan");
        Person p2 = new Person("hieu");
        Person p3 = new Person("Thong");
    }
}