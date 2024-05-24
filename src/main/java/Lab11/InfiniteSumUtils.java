package Lab11;

public class InfiniteSumUtils {
  public static double calculateInfiniteSum(double epsilon) {
    double sum = 0.0;
    double term;
    int n = 1;
    do {
      term = 1.0 / (n * n);
      double nextSum = sum + term;
      if (Math.abs(nextSum - sum) < epsilon) {
        break;
      }
      sum = nextSum;
      n++;
    } while (true);
    return sum;
  }
}