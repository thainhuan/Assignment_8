package Lec9_InheritanceAndPolymorphism.Super.Variable;

class Husky extends Dog {

    int price = 1500;

    void displayPrice() {
        System.out.println(super.price + "Dog's price: ");
        System.out.println("Husky's price: " + price);
    }
}
