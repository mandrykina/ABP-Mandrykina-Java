package Lab11;

public class TriangleUtils {
  public static double calculateHypotenuse(double a, double b) {
    return Math.sqrt(a * a + b * b);
  }

  public static double calculateArea(double a, double b) {
    return (a * b) / 2;
  }
}