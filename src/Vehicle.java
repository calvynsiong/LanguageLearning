public class Vehicle {

  double speed = 5.2;

  Vehicle(double speed) {
    this.speed = speed;
  }

  Vehicle() {}

  void go() {
    System.out.println("Moving");
  }

  void stop() {
    System.out.println("Stopped");
  }
}
