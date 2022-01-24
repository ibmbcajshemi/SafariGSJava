package many;

public class UseArrays {
  public static void main(String[] args) {
//    int ia [] ; // bad form!!!
    int [] ia; // arrays are OBJECTS
    ia = new int[5]; // all object allocation ZEROES the contents first
    System.out.println("ia[0] is " + ia[0]);
    ia[0] = 99;
    System.out.println("ia[0] is " + ia[0]);
    // Arrays are FIXED size after creation
    // also ZERO based indexing
//    System.out.println("ia[5] " + ia[5]);
    System.out.println("ia has " + ia.length + " elements");

    // do NOT specify size in the []
//    int [] ia2 = new int[]{ 1, 2, 3, 4 };
    // if context disambiguates the array type, can leave out
    // new int [] part
//    int [] ia2 = { 1, 2, 3, 4 };
    var name = "Fred"; // since Java 10!!!!
    // ONLY for initialized method local vars.
    // NOT dynamic type;
//    name = 100;
//    var anArray = { 1, 2, 3, 4 }; // NOPE
    var anArray = new int[]{ 1, 2, 3, 4 };
  }
}
