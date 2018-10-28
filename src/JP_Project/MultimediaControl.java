package JP_Project;

/**
 * The MultimediaControl interface is implemented by the AudioPlayer and MoviePlayer classes. Once
 * implemented, each class overrides the methods of MultimediaControl with contents unique to each
 * class (AudioPlayer just says "Playing" while MoviePlayer says "Playing movie")
 */
public interface MultimediaControl {

  public void play();

  public void stop();

  public void previous();

  public void next();
}
