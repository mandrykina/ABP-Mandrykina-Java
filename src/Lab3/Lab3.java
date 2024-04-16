package Lab3;

interface Run {
  String getName();

  int getSpeed();

  int getWeight();

  int getPassengersCount();

  int getWheelsCount();
}

abstract class Machine implements Run {
  public static final int MAX_SPEED = 300;
  public static final int MIN_SPEED = 0;
  public static final int MIN_PASSENGERS = 1;
  public static final int MAX_PASSENGERS = 10;

  private String name;
  private int currentSpeed;

  public Machine(String name, int speed) {
    this.name = name;
    this.currentSpeed = speed;
  }

  public String getName() {
    return this.name;
  }

  public int getSpeed() {
    return this.currentSpeed;
  }
}

abstract class Car extends Machine {
  public Car(String name, int speed) {
    super(name, speed);
  }
}

public class Lab3 {
  public static void main(String[] args) {
  }

  public static void displayInfo(Run vehicle) {
    System.out.println("Назва транспортного засобу: " + vehicle.getName());
    System.out.println("Швидкість: " + vehicle.getSpeed() + " км/год");
    System.out.println("Вага: " + vehicle.getWeight() + " кг");
    System.out.println("Кількість пасажирів: " + vehicle.getPassengersCount());
    System.out.println("Кількість коліс: " + vehicle.getWheelsCount());
    System.out.println("--------------------------------------");
  }
}