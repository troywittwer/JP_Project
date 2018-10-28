/*
Created by Troy Wittwer
9-29-2018

This interface class is used to provide methods for classes who extend it. As an interface class,
none of the methods can be given contents, which is why none of the methods use curly braces or
explicitly state a return value.
 */

package JP_Project;

import java.util.Date;

/**
 * The Item interface is implemented by the Product class. It is used to hold the manufacturer and
 * provide a means modify / retrieve item information such as the name of the item, production
 * number, manufacture date, and serial number
 */

public interface Item {

  final String manufacturer = "OracleProduction";

  public void setProductionNumber(int prodNum);

  public void setName(String name);

  public String getName();

  public Date getManufactureDate();

  public int getSerialNumber();
}
