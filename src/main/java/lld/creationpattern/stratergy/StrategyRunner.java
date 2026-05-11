package lld.creationpattern.stratergy;

import lld.creationpattern.stratergy.after.NormalDriveStrategy;
import lld.creationpattern.stratergy.after.SportsDriveStrategy;
import lld.creationpattern.stratergy.after.SportsVehicle;
import lld.creationpattern.stratergy.before.OffRoadVehicle;

public class StrategyRunner {

    // Strategy Pattern lets us remove the code duplications and the tight coupling between the child and the parent.
    public static void main(String[] args) {

        SportsVehicle sportsVehicle = new SportsVehicle(new SportsDriveStrategy());
        sportsVehicle.drive();

        OffRoadVehicle offRoadVehicleOld = new OffRoadVehicle();
        offRoadVehicleOld.drive();

        lld.creationpattern.stratergy.after.OffRoadVehicle offRoadVehicleNew = new lld.creationpattern.stratergy.after.OffRoadVehicle(new NormalDriveStrategy());
        offRoadVehicleNew.drive();
    }
}
