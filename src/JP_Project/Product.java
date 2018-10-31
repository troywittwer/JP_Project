/*
  Made by Troy Wittwer
  Date of comment: 9-29-2018

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

public class Product implements Item, Comparable<Product> {

  private int serialNumber;
  private String manufacturer;
  private Date manufacturedOn;
  private String name;

  /*
  Changed currentProductionNumber to a static variable to allow the variable to update per
  iteration of an object's creation.
   */
  private static int currentProductionNumber = 1;

  Product() {
    serialNumber = currentProductionNumber++;
    manufacturer = Item.manufacturer;
    manufacturedOn = new Date();
    name = "";
  }

  Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber++;
    manufacturedOn = new Date();
    manufacturer = Item.manufacturer;
  }

  /**
   * Produces a new production number to base serial numbers off of.
   *
   * @param currProductionNumber the new number to base serial numbers off of
   */
  public void setProductionNumber(int currProductionNumber) {
    currentProductionNumber = currProductionNumber;
  }

  /**
   * Assigns a new name to a product based on the user's parameter.
   *
   * @param name the new name of a product
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Allows user to retrieve the name of a product
   *
   * @return returns the name of the product.
   */
  public String getName() {
    return name;
  }

  /**
   * Allows user to retrieve the date a product was created on.
   *
   * @return returns the date the product was first initialized
   */
  public Date getManufactureDate() {
    return manufacturedOn;
  }

  /**
   * Allows user to retrieve the serial number of the product
   *
   * @return returns the serial number of the product
   */
  public int getSerialNumber() {
    return serialNumber;
  }


  /**
   * Allows the user to compare two objects (that are extending the Product class)
   *
   * @param prod the class object being compared is casted as a product object.
   * @return returns an integer value, based on whether the first different letter is greater than
   * or less than the letter it's being compared to
   */
  public int compareTo(Product prod) {
      return name.compareTo(prod.getName());
  }


  /**
   * Allows user to override the toString method to print out information relevant to this class The
   * Since the Manufacturer was never initialized, it will be commented out to force the toString to
   * take the value held in the implemented Item class's manufacturer String object.
   *
   * @return returns four lines of output involving manufacturer, serial number, date created, and
   * product name
   */
  @Override
  public String toString() {
    return "Manufacturer : " + manufacturer +
        "\nSerial Number : " + serialNumber +
        "\nDate : " + manufacturedOn +
        "\nName : " + name;
  }
}
