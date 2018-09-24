/*
The Product class contains five private variables:
  1.) serialNumber - this may need to be a static variable since no item should have the same
      serial number. It receives a value from a constructor.

  2.) manufacturer - a String containing the name of the manufacturer

  3.) manufacturedOn - a Date object, which should store the time an item was manufactured on,
      but has not yet received code stating as such.

  4.) name - a String object containing the name of the item being produced.

  5.) currentProductionNumber - an int value which a constructor uses to assign to a serial number
 */
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

  @Override
  public String toString(){
    return "Manufacturer\t:\t" + manufacturer +
        "\nSerial Number\t:\t" + serialNumber +
        "\nDate\t:\t" + manufacturedOn +
        "\nName\t:\t" + name;
  }
}
