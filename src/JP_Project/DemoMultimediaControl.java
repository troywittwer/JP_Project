package JP_Project;

public class DemoMultimediaControl{
  public static void main(String[]args){
    AudioPlayer ap1 = new AudioPlayer();
    AudioPlayer ap2 = new AudioPlayer("AU", "MP3");

    MoviePlayer mp1 = new MoviePlayer();
    MoviePlayer mp2 = new MoviePlayer("LED", "1920x1280", 8, 60);

    System.out.println(ap1 + "\n\n" + ap2 + "\n\n\n" + mp1 + "\n\n" + mp2);
  }
}
