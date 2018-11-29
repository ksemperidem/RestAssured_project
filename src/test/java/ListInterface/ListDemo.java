package ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args){
        List l1  = new ArrayList();
        l1.add(0, 12);
        l1.add(1, 14);

        System.out.println(l1);

        List l2 = new ArrayList();
        l2.add(10);
        l2.add(11);
        l2.add(132);
        l2.add(165);
        l2.add(187);

        l1.addAll(1, l2);

        l1.remove(3);

        System.out.println(l1);
        System.out.println("Index present at index 5 " + l1.get(5));
        l1.set(5, 122);
        System.out.println("After set operation "+l1);
        System.out.println(l1.indexOf(10));
        System.out.println(l1.lastIndexOf(165));

        List l3 = new ArrayList();
        l3 =l1.subList(2, 5);
        System.out.println(l3);
    }
}
