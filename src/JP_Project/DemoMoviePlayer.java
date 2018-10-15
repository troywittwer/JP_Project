package JP_Project;

public class DemoMoviePlayer {
  public static void main(String[] args){
    MoviePlayer m1 = new MoviePlayer();
    MoviePlayer m2 = new MoviePlayer("LCD", "1920x1280", 8, 60);

    System.out.println(m1);
    m1.play();
    m1.stop();
    m1.previous();
    m1.next();

    System.out.println("\n" + m2);
    m2.play();
    m2.stop();
    m2.previous();
    m2.next();
  }
}
