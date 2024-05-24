import org.junit.jupiter.api.Test;

import Lab11.RingUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RingUtilsTest {
  @Test
  public void testIsPointInRing() {
    assertTrue(RingUtils.isPointInRing(2.7, 0));
    assertFalse(RingUtils.isPointInRing(2.4, 0));
    assertFalse(RingUtils.isPointInRing(3.1, 0));
  }
}