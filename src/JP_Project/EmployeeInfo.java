/**
 * Created by Troy Wittwer
 * Date: 11/02/2018
 *
 * Professor Vanselow
 * COP 3003, CRN 80601
 */
package JP_Project;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {

  private StringBuilder name; // employee's name
  private String code; // employee's first initial & last name
  private String deptId;
  //private Pattern p; // pattern will be as follows: [A-Z][a-z]{3}[0-9]{2}

  /**
   * The setName method is called before the createEmployeeCode method because setName begins a
   * sequence of other methods which eventually instantiates the name StringBuilder object. The
   * createEmployeeCode method requires an instantiated value in name in order to produce the
   * employee code
   */
  EmployeeInfo() {
    Scanner in = new Scanner(System.in);
    Pattern p = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");
    setName(in);
    setDeptId(in, p);
    createEmployeeCode(name);

    in.close();
  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  public String getDeptId(){ return deptId; }

  //private String getId(){ return }

  /**
   * setName method instantiates the name StringBuilder object. This is done by retrieving the value
   * returned by the inputName method.
   */
  private void setName(Scanner in) {
    String nameString = inputName(in);
    name = new StringBuilder(nameString);
  }

  /**
   * createEmployeeCode creates a code consisting of the first initial and full last name of the
   * StringBuilder name object. The checkName method is utilized to test whether or not a space is
   * included in the name String Builder object. If the name follows the correct naming format
   * (first and last name separated by a space), a unique code will be generated. Any other
   * situation will result in a code called "guest".
   *
   * There is no functionality stating a number cannot be entered in names, so a name like "R2 D2"
   * would result in the code "RD2". A name like "6F TH" would result in the code "6TH".
   */
  private void createEmployeeCode(StringBuilder name) {

    if (checkName(name)) {  //valid. The name includes a space
      code = name.charAt(0) + name.substring(name.indexOf(" ") + 1, name.length());
    } else {
      code = "guest";
    }
  }

  /**
   * inputName creates a new instance of the Scanner class to receive user input. It then asks the
   * user to enter their first and last name. This portion is checked, so when the next line entered
   * by the user is stored in a String object, that String literal is simply returned to setName
   * method that called it.
   */
  private String inputName(Scanner in) {
    String nameString;

    //Scanner in = new Scanner(System.in);
    System.out.print("Please enter your first and last name: ");
    nameString = in.nextLine();

    in.close();
    return nameString;
  }

  private void setDeptId(Scanner in, Pattern p){
    String id = getId(in);

    deptId = validId(id, p) ? id : "None01";
  }

  private String getId(Scanner in){
    System.out.print("Please enter your ID: ");
    String id = in.next();
    return id;
  }

  private boolean validId(String id, Pattern p){
    return p.matches(p.pattern(), id);
  }

  /**
   * checkName returns a boolean value. It is simply testing whether or not a name has a space
   * character. If no space character is found, the indexOf method would return a negative value, so
   * the boolean logic only needs to make sure the value returned is greater than 0.
   *
   * Additional boolean logic is added just to make sure the user enters a name longer than two
   * characters, but the program would still work even without this boolean logic. Without this
   * boolean logic, a name like "Bb" would just result in a code "guest".
   *
   * @param name the name of the employee
   */
  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") > 0 && name.length() >= 2) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString(){
    return "Code : " + code + "\nDepartment ID : " + deptId;
  }
}
