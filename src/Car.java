public class Car {

  String make = "Chevrolet";
  String model = "Ford";
  int year = 2020;
  String color = "blue";
  double price = 50000.00;

  void drive() {
    System.out.printf("You are driving the %s %s \n", model, make);
  }

  void brake() {
    System.out.println("You stepped on brakes");
  }
}
