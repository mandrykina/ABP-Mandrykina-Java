package Lab11;

public class RingUtils {
  public static boolean isPointInRing(double x, double y) {
    double distance = Math.sqrt(x * x + y * y);
    return distance > 2.5 && distance < 3.0;
  }
}