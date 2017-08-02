import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DodgemCarTest {

  DodgemCar dodgemCar;

  @Before
  public void before() {
    dodgemCar = new DodgemCar(10, 2);
  }

  @Test
  public void driveDistanceReturnsTime() {
    assertEquals(1, dodgemCar.driveTime(10));
  }


}