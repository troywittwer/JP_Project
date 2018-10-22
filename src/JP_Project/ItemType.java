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

  public void setValue(String code) {
    this.code = code;
  }

  public String getValue() {
    return code;
  }
}
