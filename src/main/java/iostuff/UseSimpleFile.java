package iostuff;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UseSimpleFile {
  public static void main(String[] args) {
    try {
      System.out.println(getTextFromFile("a.txt"));
    } catch (IOException ioe) {
      System.out.println("It broke with: " + ioe.getMessage());
    }/* finally {}*/
    System.out.println("Continuing");
  }

  public static String getTextFromFile(String filename)
      throws IOException {
//    BufferedReader br = new BufferedReader(new FileReader(filename));

    // "try with resources" guarantees that the fr and br will
    // be closed (in reverse order from opening :)
    try (FileReader fr = new FileReader(filename);
         BufferedReader br = new BufferedReader(fr);) {
      String rv = br.readLine();
      return rv;
    }
  }
}
