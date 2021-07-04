public class Pizza {

  String bread;
  String sauce;
  String cheese;
  String topping;
  double price;

  Pizza(
    String bread,
    String sauce,
    String cheese,
    String topping,
    double price
  ) {
    this.bread = bread;
    this.sauce = sauce;
    this.cheese = cheese;
    this.topping = topping;
    this.price = price;
  }

  Pizza(String bread, String sauce) {
    this.bread = bread;
    this.sauce = sauce;
  }
}
