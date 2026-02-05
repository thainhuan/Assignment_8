package Lec11_Encapsulation.JavaAccessModifier.test2;

import Lec11_Encapsulation.JavaAccessModifier.test1.rule4.AccessModifier;

public class AccessModifier_rule4 extends AccessModifier {

    @Override
    public void display() {
        AccessModifier object = new AccessModifier();
        System.out.println(object.pvt);
        System.out.println(pro);
        System.out.println(object.pbl);
    }

    public static void main(String[] args) {
        AccessModifier object = new AccessModifier();
        object.display();
    }
}
