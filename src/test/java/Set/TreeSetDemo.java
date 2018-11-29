package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args){
        TreeSet tSet = new TreeSet();

        tSet.add(123);
        tSet.add(455);
        tSet.add(365);
        tSet.add(643);

        System.out.println(tSet);
        System.out.println(tSet.last());
        System.out.println(tSet.first());
        System.out.println(tSet.headSet(111));

        //tSet.remove(2);

        Iterator ie = tSet.iterator();
        ie.next();
        System.out.println(ie.next());
    }
}
