/*
  Created by Troy Wittwer
  9-29-2018

  This class is only used to test the enum class to make sure I'm understanding it correctly.
  I've mimiced the functionality of the Planet example class to create a for loop spanning for
  the number of values listed in the ItemType enum class.

  I was originally going to have a String value holding the values within each ItemType value,
  but it didn't seem to be necessary for this project. I didn't realize the printf %s substitute
  could return a String value as well as an object type, but I guess that makes sense seeing as
  a String literal is just a reference, as well.

  The for loop used in this class was based off of the planet example from Oracle's enum explanation

  https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 */

package JP_Project;

public class DemoEnum {

  public static void main(String[] args) {
    for (ItemType i : ItemType.values()) {
      System.out.printf("The item type is %s and the code is %s\n", i, i.getValue());
    }

    System.out.println(ItemType.AUDIO);
  }
}
