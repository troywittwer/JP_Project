package JP_Project;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProcessFiles {

  private Path p;
  private Path p2;
  private Path p3;

  /**
   * Oracle website's info on Path class: https://docs.oracle.com/javase/tutorial/essential/io/pathClass.html
   */
  ProcessFiles() throws IOException {
    p = Paths.get("C:\\LineTests"); //LineTests
    p2 = Paths.get("TestResults.txt");  //TestResults.txt
    p3 = p.resolve(p2);  // combine both paths

    CreateDirectory();
  }


  /**
   * if statement creates the directory if it doesn't already exist.
   */
  private void CreateDirectory() throws IOException {
    try {
      if (Files.notExists(p)) {
        Files.createDirectory(p);
      }
    } catch (Exception e) {
      System.out.println("Problem creating directory");
    }

  }

  /**
   * This WriteFile method takes the employee's info as an argument and writes contents to a file
   *
   * @param emp EmployeeInfo object, includes the user's first & last name along with their code
   * @throws IOException
   */
  private void WriteFile(EmployeeInfo emp) throws IOException {
    FileWriter writer = new FileWriter(p3.toString(), true);
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.print(emp);

    printWriter.close();
  }

  /**
   * This WriteFile method is overloaded to accept an ArrayList of Product objects which would
   * include any product specified by the user
   *
   * @param products an ArrayList of products specified by the user
   * @throws IOException method involves FileWriter and PrintWriter which requires the IOException
   */
  private void WriteFile(ArrayList<Product> products) throws IOException {
    FileWriter writer = new FileWriter(p3.toString(), true);
    PrintWriter printWriter = new PrintWriter(writer);

    for (Product elem : products) {
      printWriter.print(elem);
    }

    printWriter.close();
  }
  /*
  public static void main(String[] args) throws IOException, IllegalStateException {
    ProcessFiles pf = new ProcessFiles();
    EmployeeInfo empInfo = new EmployeeInfo();

    try {
      pf.WriteFile(empInfo);
    } catch (Exception e) {
      System.out.println("Problem writing to file.");
    }
  }
  */
}
