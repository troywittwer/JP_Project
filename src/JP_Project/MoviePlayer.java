package JP_Project;

public class MoviePlayer extends Product implements MultimediaControl {

  Screen screen;
  MonitorType monitorType;

  MoviePlayer() {
    screen = new Screen();
    monitorType = MonitorType.LED;
  }

  MoviePlayer(String monitorType, String resolution, int refreshrate, int responsetime) {
    super(monitorType);
    screen = new Screen(resolution, refreshrate, responsetime);
    //this.monitorType = new MonitorType(monitorType);
    if (monitorType.equals("LED"))
      this.monitorType = MonitorType.LED;
    else if (monitorType.equals("LCD"))
      this.monitorType = MonitorType.LCD;
    else
      this.monitorType = MonitorType.LED;
  }

  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stopping");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }

  @Override
  public String toString() {
    return screen.toString() + "\nMonitor Type  : " + monitorType;
  }
}
