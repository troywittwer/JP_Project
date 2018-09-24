/*
This enum class establishes the four item type values. Only contains one variable, value, which
holds the value used to indicate an item type object.
 */

package JP_Project;

public enum ItemType {
  AU("Audio"),
  VI("Visual"),
  AM("AudioMobile"),
  VM("VisualMobile");

  private String value;

  ItemType(){
    value = "";
  }

  ItemType(String itemType) {
    this.value = itemType;
  }

  public void setValue(String itemType){
    this.value = itemType;
  }

  public String getValue(){
    return value;
  }
}
