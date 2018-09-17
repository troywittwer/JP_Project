package JP_Project;

import java.util.Date;

abstract class Product implements Item{
  private int serialNumber;
  private String manufacturer;
  private Date manufacturedOn;
  private String name;
  private int currentProductionNumber;

  Product(){
    serialNumber = 0;
    manufacturer = "";
    manufacturedOn = new Date();
    name = "";
    currentProductionNumber = 0;
  }

  Product(String name, int currentProductionNumber){
    this.name = name;
    serialNumber = currentProductionNumber;
  }

  public void setProductionNumber(int currentProductionNumber){
    this.currentProductionNumber = currentProductionNumber;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public Date getManufacturedOn(){
    return manufacturedOn;
  }

  public int getSerialNumber(){
    return serialNumber;
  }
}
