package Maps;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main (String args[]){
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap();
        lhm.put("Kostya", 32);
        lhm.put("Mark", 32);
        lhm.putIfAbsent("Tiara", 21);

        System.out.println(lhm);
        System.out.println(lhm.size());
        System.out.println(lhm.isEmpty());
        System.out.println(lhm.containsKey("Kostya"));
        System.out.println(lhm.containsValue(37));
    }
}
