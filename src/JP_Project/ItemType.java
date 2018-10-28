/*
Created by Troy Wittwer
9-29-2018

This enum class establishes the four item type values. Only contains one variable, value, which
holds the value used to indicate an item type object.
 */

package JP_Project;

public enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  /*
  Changed the access modifier of String object "code" from private to public because the segment
  of code being used to test the program is written in a way that requires a public access modifier.
   */
  public String code;

  ItemType() {
    code = "";
  }

  ItemType(String code) {
    this.code = code;
  }

  /**
   * Allows user to set the short-hand value of their item type. If it matches one of the four enum
   * types, that item type will be assigned as an enum to said item
   */
  public void setValue(String code) {
    this.code = code;
  }

  /**
   * This would return a short-hand string representation of each itemtype (AU, VI, AM, or VM)
   */
  public String getValue() {
    return code;
  }
}
