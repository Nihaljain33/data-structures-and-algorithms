package lld.creationpattern.stratergy.before;

public class Vehicle {

    public void drive() {
        System.out.println("\n" + this.getClass().getSimpleName() + ": ");
        System.out.println("Driving capability: Normal");
    }
}
