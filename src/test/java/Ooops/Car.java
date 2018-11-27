package Ooops;

public class Car {

    Car(){
        System.out.println("Creating counstructor of car class");
    }

    String name = "Car Segment";

    public final void setWheels(){
        System.out.println("Only 4 wheels are allowed");
    }

    public void run(){
        System.out.println("Car is running");
    }
}
