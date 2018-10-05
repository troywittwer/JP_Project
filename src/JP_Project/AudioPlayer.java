package JP_Project;

public class AudioPlayer extends Product implements MultimediaControl{
  private String audioSpecification;
  ItemType mediaType;

  AudioPlayer(){
    super("AU");
    audioSpecification = "Generic";
    mediaType = ItemType.Audio;
  }

  AudioPlayer(String name, String audioSpecification){
    super(name);
    this.audioSpecification = audioSpecification;
    mediaType = ItemType.Audio;
  }

  public void play(){
    System.out.println("Playing");
  }

  public void stop(){
    System.out.println("Stopping");
  }

  public void previous(){
    System.out.println("Previous");
  }

  public void next(){
    System.out.println("Next");
  }

  @Override
  public String toString(){
    return super.toString() +
        "\nAudio Specification : " + audioSpecification +
        "\nMedia Type          : " + mediaType;
  }
}
