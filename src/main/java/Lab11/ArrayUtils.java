package Lab11;

public class ArrayUtils {
  public static double sumArray(double[] array) {
    double sum = 0;
    for (double num : array) {
      sum += num;
    }
    return sum;
  }
}