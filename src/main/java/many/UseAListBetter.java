package many;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseAListBetter {
  // interface Iterable is parent of Collection which is parent of List and Set
  public static void showAll(List<String> ls) {
//    for (int i = 0; i < ls.size(); i++) {
//      System.out.println("> " + ls.get(i));
//    }
    // any Iterable, or any array
    for (String s : ls) { // "enhanced for loop"
      // Java's version does NOT maintain index
      // because some Iterables (e.g. Set) do not have
      // an "order" or "index" concept
      System.out.println("> " + s);
    }
  }

  public static void main(String[] args) {
//    ArrayList<String> al = new ArrayList<String>(List.of(LocalDate.now()));
    // HERE, the inferencing fails!! (can't be LocalDate AND String!!)
//    ArrayList<String> al = new ArrayList<>(List.of(LocalDate.now()));
//    ArrayList<String> al = new ArrayList<>(List.of("Robert"));
//    List<String> al = new ArrayList<>(List.of("Robert"));
    // interface (really important idiomatic thing in Java)
    List<String> al = new LinkedList<>(List.of("Robert"));
    al.add("Fred");
    al.add("Jim");
    al.add("Sheila");
//    al.add(LocalDate.now()); // NOW this fails :)
    String s = al.get(0); // still contains the cast!!!
    System.out.println("get zero gave us " + s);
    System.out.println("which is a " + s.getClass());

    showAll(al);
  }
}
