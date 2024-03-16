package Lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Lab1 {
    // Task 1
    public void calculateTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть довжину першого катета: ");
        double sideA = scanner.nextDouble();

        System.out.print("Введіть довжину другого катета: ");
        double sideB = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        double area = 0.5 * sideA * sideB;

        System.out.println("Гіпотенуза: " + hypotenuse);
        System.out.println("Площа трикутника: " + area);
    }

    // Task 2
    public void isPointInRing() {
        double innerRadius = 2.5;
        double outerRadius = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть X: ");
        double x = scanner.nextDouble();

        System.out.println("Введіть Y: ");
        double y = scanner.nextDouble();

        double distanceFromOrigin = Math.sqrt(x * x + y * y);
        boolean isInsideRing = (distanceFromOrigin >= innerRadius) && (distanceFromOrigin <= outerRadius);

        if (isInsideRing) {
            System.out.println("Точка належить кільцю.");
        } else {
            System.out.println("Точка НЕ належить кільцю.");
        }
    }

    // Task 3
    public void calculatePiApproximation() {
        double epsilon = 1e-6;
        double exactValue = Math.PI * Math.PI / 6.0;

        double approximation = 0.0;

        int n = 1;
        while (true) {
            double term = 1.0 / (n * n);
            approximation += term;
            n++;

            if (Math.abs(term) < epsilon) {
                break;
            }
        }

        System.out.println("Точне значення π^2/6: " + exactValue);
        System.out.println("Наближене значення π^2/6: " + approximation);
    }

    // Task 4
    public void calculateArraySum() {
        double[] array = {2, 2.7, 4};
        double sum = Arrays.stream(array).sum();

        System.out.println("Сума елементів масиву: " + sum);
    }

    // Task 5
    public void findMaxFunctionValue() {
        double start = -3;
        double end = 4;

        double maxValue = Double.NEGATIVE_INFINITY;

        for (double x = start; x <= end; x += 1) {
            double functionValue = Math.pow(x, 3) - 2 * Math.pow(x, 2) + x - 1;

            if (functionValue > maxValue) {
                maxValue = functionValue;
            }
        }

        System.out.println("Максимальне значення: " + maxValue);
    }
}
