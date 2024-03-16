import Lab1.Lab1;
import Lab2.Triangle;

public class Main {
    public static void main(String[] args) {
        // Lab 1
        {
            Lab1 lab1 = new Lab1();

            lab1.calculateTriangle();
            lab1.isPointInRing();
            lab1.calculatePiApproximation();
            lab1.calculateArraySum();
            lab1.findMaxFunctionValue();
        }

        // Lab 2
        {
            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println("Периметр трикутника: " + triangle.calculatePerimeter());
            System.out.println("Площа трикутника: " + triangle.calculateArea());
        }
    }
}