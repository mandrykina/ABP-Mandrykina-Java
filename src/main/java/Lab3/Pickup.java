package Lab3;

public class Pickup extends Car {

  public Pickup(String name, int speed) {
    super(name, speed);
  }

  @Override
  public int getWeight() {
    return 2000;
  }

  @Override
  public int getPassengersCount() {
    return 3;
  }

  @Override
  public int getWheelsCount() {
    return 4;
  }
}