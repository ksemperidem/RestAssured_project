package Ooops;

public class Circle extends Shape{

    public void displayShape() {
        System.out.println("Shape is circle");
    }

    public static void main(String[] args){
        Shape s = new Circle();
        Shape s1= new Triangle();
    }
}
