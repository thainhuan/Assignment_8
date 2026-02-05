package Lec11_Encapsulation.Example2;

public class Encapsulation {

    public static void main(String[] args) {
        Person a = new Person();
        a.name = "Nhuan";
        a.setWeight(-10);
        a.setWeight(50);
        System.out.println("Nam: " + a.name);
        System.out.println("Weight: " + a.getWeight());
    }

}
