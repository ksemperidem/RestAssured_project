package Ooops;

public class BMW extends Car{

    BMW(){
        //super();
        System.out.println("Calling bmw counstructor");
    }

     String name = "BMW ";

     public void getName(){
         System.out.println(name);
         System.out.println(super.name);
     }

     //public void setWheels(){
     //
     //}

     public void run(){
         System.out.println("BMW is running");
         super.run();
     }
    public static void main(String[] args){
        //Car car = new Car();
        //System.out.print(name);
        //car.run();

        BMW bmw = new BMW();
        bmw.getName();
        bmw.run();
    }
}
