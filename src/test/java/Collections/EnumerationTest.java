package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
    public static void main(String args[]){
        Vector v = new Vector();
        for(int i =0; i<10; i++){
            v.addElement(i);
        }

        System.out.print(v);

        Enumeration e = v.elements();

        while(e.hasMoreElements()){
            int i = (Integer)e.nextElement();

            System.out.print(i+ " ");
        }
    }
}
