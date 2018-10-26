package JP_Project;

public class DemoMoviePlayer {
  public static void testMoviePlayer(){
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101", "LCD", "720x480", 40, 22);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK", "LED", "1366x768", 40, 22);

    System.out.println(m1);
    System.out.println(m2);
  }
}
