package Enums.Vehicles;

public class GetVehicleWheel {
    public static void main(String[] args) {
        VehicleType vehicleType1 = VehicleType.CAR;
        System.out.println(getNumWheels(vehicleType1));
    }
  public static int getNumWheels(VehicleType vehicleType){
        return  vehicleType.getNumWheels();
  }

}
