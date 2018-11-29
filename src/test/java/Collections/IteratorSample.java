package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {
    public static void main(String args[]){
        ArrayList al = new ArrayList();

        for(int i =0; i<10; i++)
            al.add(i);

        System.out.print("Elements of ArrayList : "+ al);

        Iterator itr = al.iterator();

        System.out.println("Starting Iterator");

        while(itr.hasNext()){
            int i = (Integer)itr.next();

            System.out.print(i + " ");

            if(i%2!=0){
                itr.remove();
            }
            System.out.println();
            System.out.print("Elements after remove Operation: "+ al);
        }
    }
}
