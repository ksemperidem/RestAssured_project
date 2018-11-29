package ListInterface;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList list = new ArrayList();
        list.add(12);
        list.add(13);
        list.add(45);
        list.add(455);
        list.add(43);

        System.out.println(list);

        list.remove(4);
        System.out.println(list);
        System.out.println(list.get(3));
    }
}
