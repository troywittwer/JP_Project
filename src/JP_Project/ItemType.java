package JP_Project;

public enum ItemType {
  AU ("Audio"), VI("Visual"), AM("AudioMobile"), VM("VisualMobile");

  private String value;

  ItemType(String value) {
    this.value = value;
  }

  public String getValue(){
    return value;
  }
}
