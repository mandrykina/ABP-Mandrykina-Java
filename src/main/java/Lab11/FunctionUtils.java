package Lab11;

public class FunctionUtils {
  public static double findMaxValue(double start, double end) {
    double max = Double.NEGATIVE_INFINITY;
    double step = 0.001;

    for (double x = start; x <= end; x += step) {
      double y = Math.pow(x, 3) - 2 * Math.pow(x, 2) + x - 1;
      if (y > max) {
        max = y;
      }
    }
    return max;
  }
}