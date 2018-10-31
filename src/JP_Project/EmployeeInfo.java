package JP_Project;

public class EmployeeInfo {
  private StringBuilder name;
  private String code;

  EmployeeInfo(){
    name.append("Generic");
    code = "Generic";
  }

  public StringBuilder getName(){
    return name;
  }

  public String getCode(){
    return code;
  }

  private void setName(String newName){
    name.replace(0, newName.length()-1, newName);
    name.trimToSize();
  }

  private void createEmployeeCode(StringBuilder name){

  }
}
