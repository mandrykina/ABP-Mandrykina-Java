import org.junit.jupiter.api.Test;

import Lab11.ArrayUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilsTest {
  @Test
  public void testSumArray() {
    double[] array = { 1.0, 2.0, 3.0, 4.0, 5.0 };
    assertEquals(15.0, ArrayUtils.sumArray(array), 0.0001);
  }
}