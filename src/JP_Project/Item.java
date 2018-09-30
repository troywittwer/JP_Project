/*
Created by Troy Wittwer
9-29-2018

This interface class is used to provide methods for classes who extend it. As an interface class,
none of the methods can be given contents, which is why none of the methods use curly braces or
explicitly state a return value.
 */

package JP_Project;

import java.util.Date;

public interface Item {

  final String manufacturer = "OracleProduction";

  public void setProductionNumber(int prodNum);

  public void setName(String name);

  public String getName();

  public Date getManufactureDate();

  public int getSerialNumber();
}
