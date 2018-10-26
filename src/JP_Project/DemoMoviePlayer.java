package JP_Project;

public class DemoMoviePlayer {
  public static void testMoviePlayer(){
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101", "720x480", 40, 22, MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK", "1366x768", 40, 22, MonitorType.LED);

    System.out.println(m1);
    System.out.println(m2);
  }
}
