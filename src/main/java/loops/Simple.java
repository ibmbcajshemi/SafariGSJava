package loops;

public class Simple {
  public static void main(String[] args) {
    int x = 3;
    while (x > 0) {
      System.out.println("x is " + x);
//      x = x - 1;
//      x -= 1;
      x--; // x++, x--, ++x, --x
    }

    do {
      System.out.println("in do loop x is " + x);
    } while (x != 0);

    // idx is treated as a "formal parameter" -- i.e. scope
    // is from declaration to the end of the immediately
    // subsequent block (or statement)
    // "normal" scope in Java is from the point of declaration
    // to the end of the immediately enclosing curly brace block
    for (int idx = 0; idx < 3; idx++) {
      System.out.println("x in for loop is " + idx);
    }
//    System.out.println("idx after is " + idx);

//    int odd = 99;
    {
      int odd = 99;
      System.out.println("odd is " + odd);
    }
//    System.out.println("odd is " + odd);
  }
}
