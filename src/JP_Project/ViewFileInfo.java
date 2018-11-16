package JP_Project;

import java.io.File;
import java.io.FileReader;

public class ViewFileInfo {

  public static void main(String[] args) {
    try{
      FileReader fr = new FileReader("C:\\LineTests\\TestResults.txt");
      int i;
      while ((i = fr.read()) != -1){
        System.out.print((char) i);
      }
    }catch (Exception e){
      System.out.println("Problem in read");
    }

    File file = new File("C:\\LineTests\\TestResults.txt");
  }
}
