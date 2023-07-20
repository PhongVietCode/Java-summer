package pac1;
public class Car extends Vehicle {
    String make = "Chervolet";
    String model = "Convertte";
    int year = 2023;
    String color = "blue";
    double price = 499.999;
    static int numberOfcar;
    Car(String make, String model, int year, String color ){
        this.make = make ;
        this.model = model;
        this.year = year;
        this.color = color;
        numberOfcar++;
    }
    void drive() {
        System.out.println("Driving...");
    }

    void brake() {
        System.out.println("Stop...");
    }

    public String toString() {
        return super.toString()+ " "+ model + " " + make;
    }

    static void display() {
        System.out.println("You have " + numberOfcar + "Cars");
    }

}
