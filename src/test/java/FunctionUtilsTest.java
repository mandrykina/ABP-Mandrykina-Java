import org.junit.jupiter.api.Test;

import Lab11.FunctionUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionUtilsTest {
  @Test
  public void testFindMaxValue() {
    assertEquals(35.0, FunctionUtils.findMaxValue(-3, 4), 0.1);
  }
}