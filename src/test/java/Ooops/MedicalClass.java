package Ooops;

public class MedicalClass implements Student {
    public void displayName() {
        System.out.println("Hi, wer are medical");
    }

    public void getStundentNumber() {
        System.out.println("130 students");
    }

    public void getStandard() {
        System.out.println("we are from mbbs");
    }

    public static void main(String[] args){
        EngineeringClass eng = new EngineeringClass();
        MedicalClass med = new MedicalClass();

        eng.displayName();
        eng.getStandard();
        eng.getStandard();
        eng.getStundentNumber();


        System.out.println("***********************");

    }

    public void getInterfaceName() {

    }
}
