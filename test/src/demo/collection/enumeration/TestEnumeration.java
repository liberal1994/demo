package demo.collection.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
    public static void main(String[] args) {
        Vector<String> vector=new Vector();
        for(int i=0;i<10;i++){
            vector.add(String.valueOf(i));
        }
        Enumeration<String> e=vector.elements();
        while(e.hasMoreElements()){
            String temp=e.nextElement();
            System.out.println(temp);
        }
    }
}
