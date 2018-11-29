package ListInterface;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(1000);
        list.add("Java");
        list.add("Collection");
        list.add(300);

        System.out.println(list);
        list.add("Anshul");
        System.out.println(list);
        list.addLast("Kostya");
        System.out.println(list);
    }
}
