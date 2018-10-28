package JP_Project;

public enum MonitorType {
  LCD("LCD"),
  LED("LED");

  public String code;

  MonitorType(){
    code = "";
  }

  MonitorType(String code){
    this.code = code;
  }

  /**
   * Allows user to set the monitor type by passing in a String literal containing said type.
   * @param code a String literal used to hold a value identifying the monitor type
   */
  public void setValue(String code){
    this.code = code;
  }

  /**
   * Allows user to retrieve a String literal of the monitor's type.
   * @return
   */
  public String getValue(){
    return code;
  }
}
