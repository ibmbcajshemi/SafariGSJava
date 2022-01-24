package hello;

//import java.lang.System;
//import java.lang.*;
import static java.lang.System.out;
import static java.lang.System.setOut;

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
    // operators + - * /
    // (divide is either integer or floating depending on arg types)
    // result of arithmetic is *at least int* or the larger of the
    // two operands
    // more operators % *remainder* (NOT MOD!!!)
    // comparisons < > <= >= == !=  these produce boolean results

    x = 50;
//    byte by = x; // NOPE, doesn't fit!
    byte by = (byte)x; // "cast" -- take the low 8 bits
    byte byt = 100; // 100 is an *int* literal, but this is permitted
    long lng = 4_000_000_000L;

    int n1 = 99;
    int n2 = 99;
    // string concatenation (and different numeric types) are the
    // ONLY operator overloading
    // Look up printf and Formatter
    out.println("n1 == n2 " + (n1 == n2));

    String name = "Fred";
    String name2 = "Freddy";
    name = name + "dy";
    out.println("name is " + name);
    out.println("name2 is " + name2);
    out.println("name == name2 " + (name == name2));
    out.println("name.equals(name2) " + (name.equals(name2)));
    name.toUpperCase();
    // Strings are *immutable*
    out.println("name is now " + name);
    String name3 = name.toUpperCase();
    out.println("name3 is " + name3);

    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    out.println("sb1 is " + sb1);
    out.println("sb2 is " + sb2);
    out.println("sb1 == sb2 " + (sb1 == sb2));
    out.println("sb1.equals(sb2) " + (sb1.equals(sb2)));
  }
}
