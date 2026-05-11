package lld.creationpattern.stratergy.before;

public class SportsCar extends Vehicle {

    @Override
    public void drive() {
        System.out.println("\n" + this.getClass().getSimpleName() + ": ");
        System.out.println("Driving capability: Sports");
    }
}
