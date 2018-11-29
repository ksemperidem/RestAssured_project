package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String args[]){
        HashSet hash = new HashSet();
        hash.add(33);
        hash.add("Kostya");
        hash.add("Test");

        System.out.println(hash);

        hash.remove("Kostya");
        System.out.println(hash);

        System.out.println("Is set Contain Anshul " + hash.contains("Kostya"));
        hash.clear();

        System.out.println("Hash is " +  hash);

        Iterator i = hash.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
