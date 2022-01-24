package many;

import java.time.LocalDate;
import java.util.ArrayList;

public class UseAList {
  public static void main(String[] args) {
    ArrayList al = new ArrayList();
    al.add("Fred");
    al.add("Jim");
    al.add("Sheila");
    System.out.println("al is " + al);
    al.add("Alice");
    al.remove(1);
    al.add(LocalDate.now());
    System.out.println("al is " + al);
    Object s = al.get(0);
    System.out.println("get zero gave us " + s);
    System.out.println("which is a " + s.getClass());
    // type of expression (variable???) at COMPILE TIME
    // determines the legal methods to invoke
    // (type of the object at RUNTIME determines the behavior
//    s.toUpperCase() // NOPE not valid for object :(
    String str = (String)s;
    System.out.println(str.toUpperCase());

//    s = al.get(3);
//    str = (String)s; // fails at runtime (item at subscript 3 is a LocalDate)
  }
}
