package Maps;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String args[]){
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        hmap.put("Kostya", 32);
        hmap.put("John", 32);
        hmap.put("Julia", 29);
        hmap.put("Peter", 27);
        hmap.put("Steve", 32);
        hmap.put("Mark", 32);

        System.out.println(hmap);

        if(hmap.containsKey("Kostya")){
            System.out.println("Age of Kostya is " + hmap.get("Kostya"));
        }
        System.out.println("Size of HashMap is: "+ hmap.size());
        hmap.clear();
        System.out.println("Is HashMap empty? " + hmap.isEmpty());
    }
}
