package Enums.Vehicles;

public enum VehicleType {
    CAR(4),
    TRUCK(4),
    MOTORCYCLE(2),
    BICYCLE(2);

    private final int numWheels;

    VehicleType(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getNumWheels() {
        return numWheels;
    }

}
