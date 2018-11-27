public class dog {

    String name = "Jacky";
    String breed = "BullDog";
    int height =4;

    public void barking()
    {
        System.out.println(name + " is barking");
    }

    public static void main(String[] args){
        dog dogclass = new dog();
        dog obj2 = new dog();
        dogclass.barking();
    }
}
