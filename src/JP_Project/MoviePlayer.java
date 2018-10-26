package JP_Project;

public class MoviePlayer extends Product implements MultimediaControl {

  Screen screen;
  MonitorType monitorType;

  MoviePlayer() {
    super("Generic");
    screen = new Screen();
    monitorType = MonitorType.LED;
  }

  MoviePlayer(String name, MonitorType monitorType, String resolution, int refreshrate, int responsetime) {
    super(name);
    screen = new Screen(resolution, refreshrate, responsetime);
    //this.monitorType = new MonitorType(monitorType);
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