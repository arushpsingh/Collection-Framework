import java.util.*;
import java.io.*;

class First {
  public static void main(String... args) {
    int arr[] = { 1, 2, 3, 4 };
    Vector<Integer> v = new Vector();
    Hashtable<Integer, String> h = new Hashtable();

    v.addElement(1);
    v.addElement(2);

    h.put(1, "Arush");
    h.put(2, "Pratap");
    h.put(3, "Singh");

    System.out.println(arr[0]);
    System.out.println(v.elementAt(0));
    System.out.println(h.get(1));
    System.out.println(h.get(2));
    System.out.println(h.get(3));

  }
}