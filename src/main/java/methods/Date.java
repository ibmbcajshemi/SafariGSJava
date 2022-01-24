package methods;

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
  }
}
