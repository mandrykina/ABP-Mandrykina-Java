package main.java.Lab3;

public class Convertible extends Car {

  public Convertible(String name, int speed) {
    super(name, speed);
  }

  @Override
  public int getWeight() {
    return 1800;
  }

  @Override
  public int getPassengersCount() {
    return 4;
  }

  @Override
  public int getWheelsCount() {
    return 4;
  }
}