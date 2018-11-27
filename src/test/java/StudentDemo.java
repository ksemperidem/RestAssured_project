public class StudentDemo {

    int rollnumber;
    String name;
    String Standard;

    public StudentDemo(int rollnumber, String name, String Standard){
        this.rollnumber =rollnumber;
        this.name =name;
        this.Standard = Standard;
    }

    public void display(){
        System.out.println("Stunder oll number "+ rollnumber + " name is " + name + " and class "+ Standard);
    }


    public static void main(String[] args){
       StudentDemo std = new StudentDemo(10, "Frank", "2nd");
       StudentDemo std1 = new StudentDemo(20, "Michael", "4th");

       std.display();
       std1.display();
    }
}
