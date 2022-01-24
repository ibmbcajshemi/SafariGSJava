package classes;

import java.util.List;

public class Date {
  public int day; // variable data in object SHOULD BE PRIVATE
  public int month; // provide methods that access and mutate the values
  public int year; // and ENSURE THEIR VALIDITY AT ALL TIMES OR THROW EXCEPTIONS

  // initializers are called "constructor"
  // constructors MUST NOT declare return type!!!!
  // these receive an "implicit" argument called "this"
  // precreated and zeroed, our job is to initialize it
  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date(int day, int month) {
    this(day, month, 2022); // delgate to other overloaded constructor
  }

  public static boolean isLeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  public static boolean isLeapYear() {
    return isLeapYear(2022);
  }

  // public is accessible anywhere inside this JVM OR this module
  // "default access" i.e. no public etc. is "only in the same package"
  // private is inside the enclosing TOP LEVEL curlies surrounding
  // the declaration
   private static List<String> months = List.of("January", "February", "March", "April",
      "May", "June", "July", "August", "September", "October",
      "November", "December");

  public static String getMonthNamesFromNumbers(int ... n) {
    StringBuilder rv = new StringBuilder();
    for (int num : n) {
      rv.append(months.get(num - 1)).append(", ");
    }
    rv.setLength(rv.length() - 2);
    return rv.toString();
  }

  // Saturday = 0 ... Friday = 6
  public static int getDayOfWeek(int day, int month, int year) {
    if (month < 2) {
      month += 12;
      year--;
    }
    return (day + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7;
  }

  public static int getDayOfWeek(Date d) {
    return getDayOfWeek(d.day, d.month, d.year);
  }

//  public  int getDayOfWeek(Date this) {
//  public  int getDayOfWeek(/*Date this*/) {
// this with "implicit this" is identical to above
  public  int getDayOfWeek() {
    return getDayOfWeek(this.day, this.month, this.year);
  }

  public static String getAsText(Date d) {
    return "Date of day=" + d.day + " month=" + d.month + "year=" + d.year;
  }

  public /*static*/ String getAsText(Date this) {
    return "(instance method) Date of day=" + this.day
        + " month=" + this.month + "year=" + this.year;
  }

  public String toString() {
    return "(Date instance toString) Date of day=" + this.day
        + " month=" + this.month + "year=" + this.year;
  }
}


