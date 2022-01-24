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
  }
}
