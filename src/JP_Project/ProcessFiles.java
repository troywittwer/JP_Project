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
   * Oracle website's info on Path class:
   * https://docs.oracle.com/javase/tutorial/essential/io/pathClass.html
   */
  ProcessFiles() throws IOException{
    p = Paths.get("C:\\LineTests"); //LineTests
    p2 = Paths.get("TestResults.txt");  //TestResults.txt
    p3 = p.resolve(p2);  // combine both paths

    CreateDirectory();
  }


  /**
   * if statement creates the directory if it doesn't already exist.
   * @throws IOException
   */
  private void CreateDirectory() throws IOException{
    try{
      if (Files.notExists(p)){
        Files.createDirectory(p);
      }
    }
    catch(Exception e){
      System.out.println("Problem creating directory");
    }

  }

  private void WriteFile(String emp) throws IOException {
    FileWriter writer = new FileWriter(p3.toString(), true);
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.print(emp);

    printWriter.close();
  }

  private void WriteFile(ArrayList<Product> products) throws IOException{

  }

  public static void main(String[] args) throws IOException{
    ProcessFiles pf = new ProcessFiles();

    try{
      pf.WriteFile("test");
    }
    catch(Exception e){
      System.out.println("Problem writing to file.");
    }
  }
}
