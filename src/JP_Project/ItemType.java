/*
Created by Troy Wittwer
9-29-2018

This enum class establishes the four item type values. Only contains one variable, value, which
holds the value used to indicate an item type object.
 */

package JP_Project;

public enum ItemType {
  Audio("AU"),
  Visual("VI"),
  AudioMobile("AM"),
  VisualMobile("VM");

  private String code;

  ItemType() {
    code = "";
  }

  ItemType(String code) {
    this.code = code;
  }

  public void setValue(String code) {
    this.code = code;
  }

  public String getValue() {
    return code;
  }
}
