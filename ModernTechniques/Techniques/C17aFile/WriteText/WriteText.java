/**
 * From Chapter 12 in Liang Y Daniel, Introduction to Java Programming, 11st Edition
 */
import java.io.File;
import java.io.PrintWriter;

public class WriteText {
  public static void main(String[] args) throws Exception {
    String filename;
    if (args.length == 0) {
      filename = "scores.txt";
    } else {
      filename = args[0];
    }
    File file = new File(filename);
    if (file.exists()) {
      System.out.println("File " + filename + " already exists");
      System.exit(0);
    }

    // Create a file
    PrintWriter output = new PrintWriter(file);

    // Write formatted output to the file
    output.print("John T Smith ");
    output.println(90);
    output.print("Eric K Jones ");
    output.println(85);

    // Close the file
    output.close();
    System.out.println("Wrote to " + file.getAbsolutePath());
    System.out.println("Or wrote to relative path " + file.getPath());
  }
}
