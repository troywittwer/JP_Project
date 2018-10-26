package JP_Project;

public class MoviePlayer extends Product implements MultimediaControl {

  Screen screen;
  MonitorType monitorType;

  MoviePlayer() {
    super("Generic");
    screen = new Screen();
    monitorType = MonitorType.LED;
  }

  MoviePlayer(String name, String resolution, int refreshrate, int responsetime, MonitorType monitorType) {
    super(name);
    screen = new Screen(resolution, refreshrate, responsetime);
    this.monitorType = monitorType;
  }

  MoviePlayer(String name, Screen screen, MonitorType monitorType){
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  public void play() {
    System.out.println("Playing movie");
  }

  public void stop() {
    System.out.println("Stopping movie");
  }

  public void previous() {
    System.out.println("Previous movie");
  }

  public void next() {
    System.out.println("Next movie");
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + screen.toString() + "\nMonitor Type : " + monitorType;
  }
}
