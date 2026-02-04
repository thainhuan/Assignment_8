package Lec8_ObjectAndClass.MethodOverloading.ChangingOrder;

public class OverloadingExample {

    public static void printfo(String name, int age) {
        System.out.println("Name: " + name + ",Age: " + age);
    }

    public static void printfo(int age, String name) {
        System.out.println("Age: " + age + ",Name: " + name);
    }

}
