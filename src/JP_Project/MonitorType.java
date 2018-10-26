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

  public void setValue(String code){
    this.code = code;
  }

  public String getValue(){
    return code;
  }
}
