package driver_management;
import behaviours.*;

public class DodgemCar implements Driveable {

  public int averageSpeed;
  private int numSeats;

  public DodgemCar(int averageSpeed, int numSeats) {
    this.averageSpeed = averageSpeed;
    this.numSeats = numSeats;
  }



  public int driveTime(int distance) {
    return distance/this.averageSpeed;
  }


}