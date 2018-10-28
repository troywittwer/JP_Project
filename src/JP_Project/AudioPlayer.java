package JP_Project;

public class AudioPlayer extends Product implements MultimediaControl{
  private String audioSpecification;
  ItemType mediaType;

  /**
   * No argument constructor
   */
  AudioPlayer(){
    super("AU");
    audioSpecification = "Generic";
    mediaType = ItemType.AUDIO;
  }

  /**
   *
   * @param name the product name
   * @param audioSpecification a String containing the description of the media
   */
  AudioPlayer(String name, String audioSpecification){
    super(name);
    this.audioSpecification = audioSpecification;
    mediaType = ItemType.AUDIO;
  }

  /**
   * A method to differentiate the audio play from the movie play
   */
  public void play(){
    System.out.println("Playing");
  }

  /**
   * A method to differentiate the audio stop from a movie stop
   */
  public void stop(){
    System.out.println("Stopping");
  }

  /**
   * A method to differentiate the audio previous from a movie previous
   */
  public void previous(){
    System.out.println("Previous");
  }

  /**
   * A method to differentiate the audio next from a movie next
   */
  public void next(){
    System.out.println("Next");
  }

  @Override
  public String toString(){
    return super.toString() +
        "\nAudio Spec : " + audioSpecification +
        "\nType : " + mediaType;
  }
}

