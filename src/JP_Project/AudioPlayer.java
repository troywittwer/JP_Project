package JP_Project;

public class AudioPlayer extends Product implements MultimediaControl{
  private String audioSpecification;
  ItemType mediaType;

  AudioPlayer(){
    super("AU");
    audioSpecification = "Generic";
    mediaType = ItemType.AUDIO;
  }

  AudioPlayer(String name, String audioSpecification){
    super(name);
    this.audioSpecification = audioSpecification;
    mediaType = ItemType.AUDIO;
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
        "\nAudio Spec : " + audioSpecification +
        "\nType : " + mediaType;
  }
}

