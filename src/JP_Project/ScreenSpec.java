package JP_Project;

/**
 * The ScreenSpec interface is only used by the Screen class at the moment, but the fact that it's
 * an interface implies that other classes would be able to utilize it in the future. This interface
 * has no constant / static values, it only consists of three methods. More methods may be added in
 * the future, though the Screen classes will need to be updated to include any additional methods,
 * as well
 */
public interface ScreenSpec {

  public String getResolution();

  public int getRefreshRate();

  public int getResponseTime();
}
