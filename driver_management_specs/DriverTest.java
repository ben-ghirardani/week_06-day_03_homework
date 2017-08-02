import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest {

  Driver driver;
  DodgemCar dodgemcar;
  QuadBike quadbike;

  @Before
  public void before() {
    driver = new Driver("Herbert", dodgemcar);
  }

}