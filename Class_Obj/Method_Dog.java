// Java Program to Demonstrate the 
// use of a class with instance variable 

// Class Declaration
public class Method_Dog {

  // Instance Variables
  String name;
  String breed;
  int age;
  String color;

  // Constructor Declaration of Class
  public Method_Dog(String name, String breed, int age,
      String color) {
    this.name = name;
    this.breed = breed;
    this.age = age;
    this.color = color;
  }

  // method 1
  public String getName() {
    return name;
  }

  // method 2
  public String getBreed() {
    return breed;
  }

  // method 3
  public int getAge() {
    return age;
  }

  // method 4
  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return ("Name: " + this.getName() + ", Breed: " + this.getBreed() + " ,Age: " + this.getAge() + " ,Color:"+ this.getColor());
  }

  public static void main(String[] args) {
    Method_Dog tuffy = new Method_Dog("tuffy", "papillon", 5, "white");
    System.out.println(tuffy.toString());
  }
}
