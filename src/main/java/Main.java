package main.java;

import java.util.Scanner;

import main.java.Lab1.Lab1;
import main.java.Lab10.QuadraticEquationSolver;
import main.java.Lab2.Triangle;
import main.java.Lab3.Convertible;
import main.java.Lab3.Lab3;
import main.java.Lab3.Pickup;
import main.java.Lab4.Lab4;
import main.java.Lab5.Lab5;
import main.java.Lab6.Lab6;
import main.java.Lab7.PopulationApp;
import main.java.Lab8.TriangleDrawer;
import main.java.Lab9.CarDealerApp;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть номер лабораторної роботи (1-10):");
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
            case 9:
                runLab9();
                break;
            case 10:
                runLab10();
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

    public static void runLab9() {
        CarDealerApp carDealerApp = new CarDealerApp();
        carDealerApp.setVisible(true);
    }

    public static void runLab10() {
        QuadraticEquationSolver quadraticEquationSolver = new QuadraticEquationSolver();
        quadraticEquationSolver.solve();
    }
}