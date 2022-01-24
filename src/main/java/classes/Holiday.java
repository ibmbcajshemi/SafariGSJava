package classes;

public class Holiday extends Date {
  public String name;

  public Holiday(int day, int month, int year, String name) {
    super(day, month, year); // MUST COME FIRST
    this.name = name;
  }

//  @Override
  public String toString() {
    return super.toString() + " which is a holiday called " + name;
  }
}
