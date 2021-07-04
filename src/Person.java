public class Person {

  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  String info() {
    return this.name + " " + this.age;
  }
}

class Hero extends Person {

  String power;

  Hero(String name, int age, String power) {
    super(name, age);
    this.power = power;
  }

  String info() {
    return super.info() + this.power;
  }
}
