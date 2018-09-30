# JP_Project

This project has the first three steps of the project description completed. Primary files include the following:

Project.java
Item.java (interface class)
ItemType.java (enum class)
DemoEnum.java (only used to test the enum class ItemType.java)
JP_Project.java (has not needed to be modified, yet)
Main.java (will be used to test the program for this turn in)

The Product class implements the Item interface to gain access to all methods within the Item interface (if it didn't use all
methods, the Product class would need to be abstract).

At the moment, this program has successfully tested the enum class (all four item type values) and has successfully returned all
four contents of the Product class's toString method. The Product class's manufacturer String object needed to be commented out
because it was being prioritized over the manufacturer String object from the implemented Item class (the toString was returning
a null value for manufacturer before Product class's manufacturer was commented out).

It wasn't specified in the instructions, but I decided to set the Product class variable "currentProductionNumber" to a static
variable to all the integer value to keep track of which serial number it's currently on, regardless of class iteration.
------------------------------------------------------------------------------------------------
DemoEnum was created using a for loop with the same logic as the Planet example:

My for loop:
  for (ItemType i : ItemType.values()) {
      System.out.printf("The item type is %s and the code is %s\n", i, i.getValue());
  }

Oracle's for loop:
  for (Planet p : Planet.values())
      System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
------------------------------------------------------------------------------------------------      
All files have a comment at the top of the file stating the date of 9-29-2018; these files were created prior to following along
in class, but I didn't add the date or my name until just now. I don't remember the exact date each file was created, so I just
chose today's date.



