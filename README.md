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



10-27-2018
At this point, the project has been completed up to step 16. I've gone ahead and added comments to all classes except for the driver classes. I didn't add comments to these because it sounds like these are only intended for testing purposes by the programmer creating the respected classes. As far as I'm aware, I'll be testing these classes myself to make sure they're functioning correctly before passing them off to the next person. I don't believe these driver classes would make it to the final product, so I didn't see any point in adding comments unless they're for myself, but I'm not going to get distracted since I'm only focused on getting the current class to function properly with it's driver.

There are three interfaces at this point (but only one is being implemented by multiple classes): Item, MultimediaControl, and ScreenSpec. Item is only being implemented by the Product class. ScreenSpec is only being implemented by the Screen class. MultimediaControl is being implemented by the AudioPlayer and MoviePlayer classes. Since only one interface is being implemented by multiple classes, the only example of overloading an interfaces methods comes from the four methods being inherited by the AudioPlayer and MoviePlayer classes (play, stop, previous, next). Even then, the only difference is text output.

My driver classes do not share the same name as the driver classes listed in repl.it. All of my driver classes have a naming convention of "Demo" plus the name of class receiving the driver, like "MoviePlayer", in this example the whole class name would be "DemoMoviePlayer". My only method in each of these classes was originally a main method since that's how driver classes were introduced to us, however I needed to change the method name to allow for the methods being invoked in various test cases from repl.it. 

An ArrayList is able to be sorted using "Collections.sort(nameOfArrayListObject)". An ArrayList can also be assigned the memory address of another ArrayList, similar to a String object being assigned the memory address of another String object.

The Product class was given functionality that allows the Collections.sort function to work with it. This was done by implementing the Comparable<Product> interface and creating a compareTo method dictating the logic. I gave the compareTo method if/else logic, but it should only need the only line "return name.compareTo(prod.getName());". My if statement specifies to return 0 if the current object's name String literal has the same characters as the arguement Product object's name String literal, but a 0 would still be returned by the else logic, anyway. I left it in because the repl.it wouldn't allow me to modify my code and I didn't want the two to differ too much.
  
The MonitorType enum is a shameless copy of the ItemType enum. It probably doesn't need to be. The instructions were really vague.
