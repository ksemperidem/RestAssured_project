public class Students {

    public Students(){
        System.out.println("Im inside constructor");
    }

    int rollNumber;
    String name;

    public Students(int i, String n){
          rollNumber = i;
          name =n;
    }

    public void display(){
        System.out.println("roll number is " +  rollNumber + name);
    }

public static void main(String[] args){
    Students std = new Students();

    Students std1 = new Students( 10, "James");
    Students std2 = new Students(20, "Natalia");

    std1.display();
    std2.display();
}
}
