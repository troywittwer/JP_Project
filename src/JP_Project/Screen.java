package JP_Project;

public class Screen implements ScreenSpec{
  private String resolution;
  private int refreshrate;
  private int responsetime;

  Screen(){
    resolution = "Generic";
    refreshrate = 0;
    responsetime = 0;
  }

  Screen(String resolution, int refreshrate, int responsetime){
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  public String getResolution(){
    return resolution;
  }

  public int getRefreshRate(){
    return refreshrate;
  }

  public int getResponseTime(){
    return responsetime;
  }

  @Override
  public String toString(){
    return "Resolution    : " + resolution +
        "\nRefresh rate  : " + refreshrate +
        "\nResponse time : " + responsetime;
  }
}
