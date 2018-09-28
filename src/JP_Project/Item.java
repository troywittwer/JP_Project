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
