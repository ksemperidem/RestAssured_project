public class sB_1 {

    static int varSec =2;

    public static void firstMethod(){
        //static int varthree =111;

        int number = 123456;
        boolean flag = true;
        char character = 'a';
        long phoneNumber = 435435L;
        double decimalValue = 2323.233;


        String city = "newyork";

        System.out.println(number);
        System.out.println(city);
        System.out.println(varSec);
    }

    public static void main(String[] args){
        sB_1.firstMethod();
        System.out.println(varSec);
    }
}
