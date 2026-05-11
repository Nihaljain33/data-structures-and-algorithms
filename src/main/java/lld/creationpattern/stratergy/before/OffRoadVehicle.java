package lld.creationpattern.stratergy.before;

public class OffRoadVehicle extends Vehicle {

    @Override
    public void drive() {
        System.out.println("\n" + this.getClass().getSimpleName() + ": ");
        System.out.println("Driving capability: Off Road");
    }
}
