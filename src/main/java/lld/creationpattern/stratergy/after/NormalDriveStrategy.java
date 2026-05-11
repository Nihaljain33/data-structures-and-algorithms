package lld.creationpattern.stratergy.after;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Drive Strategy Normal");
    }
}
