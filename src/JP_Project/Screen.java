package JP_Project;

public class Screen implements ScreenSpec {

  private String resolution;
  private int refreshrate;
  private int responsetime;

  /**
   * Default constructor. The repl.it did not use this constructor, so I just assigned it "Generic"
   */
  Screen() {
    resolution = "Generic";
    refreshrate = 0;
    responsetime = 0;
  }

  /**
   * Overloaded constructor. Used when user passes three values (a String literal followed by two
   * integers)
   *
   * @param resolution the x&y coordinates of pixel dimensions as a String literal
   * @param refreshrate an integer representing the refreshrate of the screen
   * @param responsetime an integer representing the response time of the screen
   */
  Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  /**
   * getter method used to return the screen resolution
   * @return
   */
  public String getResolution() {
    return resolution;
  }

  /**
   * getter method used to return the screen's refresh rate
   * @return
   */
  public int getRefreshRate() {
    return refreshrate;
  }

  /**
   * getter method used to return the screen's response time
   * @return
   */
  public int getResponseTime() {
    return responsetime;
  }

  /**
   * Allows user to print out the contents of the screen object.
   * @return
   */
  @Override
  public String toString() {
    return "Screen : Resolution : " + resolution +
        "\nRefresh rate : " + refreshrate +
        "\nResponse time : " + responsetime;
  }
}
