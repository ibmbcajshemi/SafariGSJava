package hello;

//import java.lang.System;
//import java.lang.*;
import static java.lang.System.out;

public class Hello {
  public static void main(String [] args) {
    /*java.lang.*//*System.*/out.println("Hello Java World!");

//    int x;
//    x = 99;
//    int x = 99;
    int x;
    double y = Math.random();
    if (y > -1) { // MUST be a 'boolean' expression
      x = 99;
    } else /*if(xxx) */{
      x = 100;
    }
    out.println(x);
//    if (true) {}
    // 8 primitive types in java
    // boolean byte short char int long float double
  }
}
