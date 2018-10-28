package JP_Project;

public class MoviePlayer extends Product implements MultimediaControl {

  Screen screen;
  MonitorType monitorType;

  /**
   * Default constructor. repl.it didn't specifically request this constructor be used, so I took
   * the liberty of assigning an LED monitor type to any monitor object initialized with the default
   * constructor
   */
  MoviePlayer() {
    super("Generic");
    screen = new Screen();
    monitorType = MonitorType.LED;
  }

  /**
   * First constructor. This constructor assumes the user did not create a Screen object before
   * initializing the MoviePlayer object.
   *
   * @param name the name of the product, it is assigned to the super constructor (Product)
   * @param resolution the pixel dimensions
   * @param refreshrate an integer representing refresh rate
   * @param responsetime an integer representing standard response tme
   * @param monitorType an enum that will either be LED or LCD
   */
  MoviePlayer(String name, String resolution, int refreshrate, int responsetime,
      MonitorType monitorType) {
    super(name);
    screen = new Screen(resolution, refreshrate, responsetime);
    this.monitorType = monitorType;
  }

  /**
   * Second constructor. This constructor assumes the user created a Screen object before (or
   * during) initialization of the MoviePlayer object
   */
  MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  /**
   * A method differentiating the movie player play from audio play
   */
  public void play() {
    System.out.println("Playing movie");
  }

  /**
   * A method differentiating the movie player stop from audio stop
   */
  public void stop() {
    System.out.println("Stopping movie");
  }

  /**
   * A method differentiating the movie player previous from audio previous
   */
  public void previous() {
    System.out.println("Previous movie");
  }

  /**
   * A method differentiating the movie player next from audio next
   */
  public void next() {
    System.out.println("Next movie");
  }

  /**
   * Allows user to print the contents of the MoviePlayer object, along with the extended Product
   * class variables. Product class' variables will be displayed first.
   */
  @Override
  public String toString() {
    return super.toString() + "\n" + screen.toString() + "\nMonitor Type : " + monitorType;
  }
}
