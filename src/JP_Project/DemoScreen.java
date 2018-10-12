package JP_Project;

public class DemoScreen {
  public static void main(String[] args){
    Screen myScreen = new Screen();
    Screen yourScreen = new Screen("1920x1200", 8, 3);

    System.out.println(myScreen + "\n");
    System.out.println(yourScreen);
  }
}
