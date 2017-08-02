package driver_management;
import behaviours.*;

public class Driver {

  private String name;
  private Driveable vehicle;

  public Driver(String name, Driveable vehicle) {
    this.name = name;
    this.vehicle = vehicle;
  }



  public Driveable getVehicle(){
    return this.vehicle;
  }

// error on line 23 : cannot find symbol averageSpeed. I guess I'm not giving Driver access to averageSpeed, which exists on both the QuadBike and DodgemCar. I thought by including a Driveable vehicle (line 7) I would gain access to averageSpeed. Copying the method exactly from QuadBike and DodgemCar though. Way to access the method from there without repeating it?

  public int driveTime(int distance) {
    return distance / this.vehicle.averageSpeed;
  }



}