import Lab11.TriangleUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TriangleUtilsTest {
  @Test
  public void testCalculateHypotenuse() {
    assertEquals(5.0, TriangleUtils.calculateHypotenuse(3, 4), 0.0001);
  }

  @Test
  public void testCalculateArea() {
    assertEquals(6.0, TriangleUtils.calculateArea(3, 4), 0.0001);
  }
}