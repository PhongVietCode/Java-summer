package pac1;

public abstract class Vehicle {
    double speed;
    
    void go() {
        System.out.println("this is moving");
    }

    void stop() {
        System.out.println("This has been stop");
    }

    public String toString() {
        return "this is a vehicle";
    }

    

}
