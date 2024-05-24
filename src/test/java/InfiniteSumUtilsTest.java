import org.junit.jupiter.api.Test;

import Lab11.InfiniteSumUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InfiniteSumUtilsTest {
  @Test
  public void testCalculateInfiniteSum() {
    double epsilon = 0.000000001;
    double expected = Math.PI * Math.PI / 6;
    double result = InfiniteSumUtils.calculateInfiniteSum(epsilon);
    double roundedExpected = round(expected, 4);
    double roundedResult = round(result, 4);
    assertEquals(roundedExpected, roundedResult, epsilon);
  }

  private double round(double value, int places) {
    double scale = Math.pow(10, places);
    return Math.round(value * scale) / scale;
  }
}