import java.util.Scanner;

import Lab1.Lab1;
import Lab2.Triangle;
import Lab3.Convertible;
import Lab3.Lab3;
import Lab3.Pickup;
import Lab4.Lab4;
import Lab5.Lab5;
import Lab6.Lab6;
import Lab7.PopulationApp;
import Lab8.TriangleDrawer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть номер лабораторної роботи (1-8):");
        int labNumber = scanner.nextInt();

        switch (labNumber) {
            case 1:
                runLab1();
                break;
            case 2:
                runLab2();
                break;
            case 3:
                runLab3();
                break;
            case 4:
                runLab4();
                break;
            case 5:
                runLab5();
                break;
            case 6:
                runLab6();
                break;
            case 7:
                runLab7();
                break;
            case 8:
                runLab8();
                break;
            default:
                System.out.println("Невірний номер лабораторної роботи.");
        }

        scanner.close();
    }

    public static void runLab1() {
        Lab1 lab1 = new Lab1();

        lab1.calculateTriangle();
        lab1.isPointInRing();
        lab1.calculatePiApproximation();
        lab1.calculateArraySum();
        lab1.findMaxFunctionValue();
    }

    public static void runLab2() {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Периметр трикутника: " + triangle.calculatePerimeter());
        System.out.println("Площа трикутника: " + triangle.calculateArea());
    }

    public static void runLab3() {
        Lab3.displayInfo(new Convertible("Audi A3", 220));
        Lab3.displayInfo(new Pickup("Ford F-150", 180));
    }

    public static void runLab4() {
        Lab4.renderGraph();
    }

    public static void runLab5() {
        Lab5.renderRegisterForm();
    }

    public static void runLab6() {
        Lab6 triangleDrawing = new Lab6();
        triangleDrawing.setVisible(true);
    }

    public static void runLab7() {
        new PopulationApp();
    }

    public static void runLab8() {
        TriangleDrawer triangleDrawer = new TriangleDrawer();
        triangleDrawer.setVisible(true);
    }
}