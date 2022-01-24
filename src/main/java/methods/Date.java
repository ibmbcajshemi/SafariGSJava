package methods;

import java.util.List;

public class Date {
  // NO "default argument values" NOR "named argument passing"
  public static boolean isLeapYear(int year) {
//    boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
//    return isLeap;
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  // methods' full names are "package.class.method.argument-types
  public static boolean isLeapYear() {
    return isLeapYear(2022);
  }


//  public static String getMonthNamesFromNumbers(int [] n) {
  public static String getMonthNamesFromNumbers(int ... n) {
    List<String> months = List.of("January", "February", "March", "April",
        "May", "June", "July", "August", "September", "October",
        "November", "December");
    StringBuilder rv = new StringBuilder();
    for (int num : n) {
      rv.append(months.get(num - 1)).append(", ");
    }
    rv.setLength(rv.length() - 2);
    return rv.toString();
  }

  // varargs
  // exceptions

  // Saturday = 0 ... Friday = 6
  public static int getDayOfWeek(int day, int month, int year) {
    // Zeller's congruence (wikipedia :)
    if (month < 2) {
      month += 12;
      year--;
    }
    return (day + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7;
  }

  public static void main(String[] args) {
    System.out.println("Today is day number " + Date.getDayOfWeek(24, 1, 2022));
    // NOPE no named parameters
//    System.out.println("Today is day number " + Date.getDayOfWeek(month=1, 24, 2022));
    System.out.println("Months 2, 5, 7 are "
//        + getMonthNamesFromNumbers(new int []{2, 5, 7}));
        + getMonthNamesFromNumbers(2, 5, 7));

    try {
      String message = getMonthNamesFromNumbers(-1, 2, 5, 7);
      System.out.println("Months 2, 5, 7 are " + message);
    } catch(ArrayIndexOutOfBoundsException ae) {
      System.out.println("it broke with " + ae.getMessage());
    }
    System.out.println("We're still going");
  }
}
