package JP_Project;

public class DemoAudioPlayer {
  public static void testAudioPlayer(){
    AudioPlayer audioPlay1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer audioPlay2 = new AudioPlayer("Walkman", "WAV");

    audioPlay1.play();
    audioPlay1.stop();
    audioPlay1.next();
    audioPlay1.previous();

    System.out.println(audioPlay1);
    System.out.println(audioPlay2);
  }
}