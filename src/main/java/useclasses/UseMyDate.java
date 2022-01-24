package useclasses;

import classes.Date;
import classes.Holiday;
//import static classes.Date.months;

public class UseMyDate {
  public static void main(String[] args) {
    System.out.println("day of week today is "
        + Date.getDayOfWeek(24, 1, 2022));

//    System.out.println("name of first month is " + months.get(0));
    // inaccessible if private!
//    System.out.println("name of first month is " + Date.months.get(0));

//    Date sillyDay = new Date();
//    Date today = new Date(24, 1, 2022);
    Date today = new Date(24, 1);
    System.out.println("today.day is " + today.day);
    System.out.println("day of week is " + Date.getDayOfWeek(today));

    System.out.println("today is " + Date.getAsText(today));
    System.out.println("today is " + today.getAsText());

    Date hol = new Holiday(1, 1, 2023, "New year's day");
    System.out.println("Holiday is " + hol.getAsText());
    System.out.println("Holiday is " + hol);
  }
}
