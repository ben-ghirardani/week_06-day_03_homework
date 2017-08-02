import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class QuadBikeTest {

  QuadBike quadbike;

  @Before
  public void before() {
    quadbike = new QuadBike(10, 50);
  }

  @Test
  public void driveDistanceReturnsTime() {
    assertEquals(1, quadbike.driveTime(10));
  }

}