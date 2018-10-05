package JP_Project;

public class DemoAudioPlayer {
  public static void main(String [] args){
    AudioPlayer audioPlay1 = new AudioPlayer();
    AudioPlayer audioPlay2 = new AudioPlayer("AU", "MP3");

    System.out.println(audioPlay1 + "\n");
    System.out.println(audioPlay2 + "\n");

    audioPlay2.play();
    audioPlay2.stop();
    audioPlay2.previous();
    audioPlay2.next();
  }
}
