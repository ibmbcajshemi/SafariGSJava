package control;

public class Conditions {
  public static void main(String[] args) {
    int x = 99;
    int y = 100;
    if (x > y) {
      System.out.println("surprise!?");
    } else {
      System.out.println("Sane");
    }

    String message = (x > y) ? "surprising!!!" : "looks about right";
    System.out.println(message);
    final int t = 100; // final makes something kinda constant
    switch (x) {
      case 0: // case targets must be *constants*
      case 1:
      case 2:
        System.out.println("It's zero, one or two");
        break; // otherwise we "fall through"
      case 99:
      case t:
        System.out.println("it's 99");
        break;
//      default:
//        System.out.println("it's something else");
//        break;
    }

    // at Java 14 we add more to switch...
    switch (x) {
      case 99 -> {
        System.out.println("two messages...");
        System.out.println("using arrow it's 99");
      }
      case 100 -> System.out.println("using arrow it's 100");
      default -> System.out.println("using arrow it's something else");
    }

    // and (since Java 14) switch can be an expression
    // (also works with colon form, but why???)
    String msg = switch (x) { // context sensitive!
      case 99 -> "ninetynine";
      default -> "something else";
    };
  }
}
