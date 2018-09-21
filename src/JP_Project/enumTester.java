/*
  This class is only used to test the enum class to make sure I'm understanding it correctly.
  I've mimiced the functionality of the Planet example class to create a for loop spanning for
  the number of values listed in the ItemType enum class.

  I was originally going to have a String value holding the values within each ItemType value,
  but it didn't seem to be necessary for this project. I didn't realize the printf %s substitute
  could return a String value as well as an object type, but I guess that makes sense seeing as
  a String literal is just a reference, as well.
 */

package JP_Project;

public class enumTester {
  public static void main(String[] args){
    for (ItemType i : ItemType.values()){
      System.out.printf("The type is %s and the value is %s\n", i, i.getValue());
    }
  }
}
