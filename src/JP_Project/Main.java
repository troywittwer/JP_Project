/**
 * This class will be restructured to perform the final step, step 23.
 * This class must perform the following:
 *
 * 1.) Allow user:
 *     a.) Add a new product
 *     b.) Specify how many items of that product should be created.
 *
 * 2.) Program will then:
 *     a.) Create these items
 *     b.) Store them in a collection.
 *
 * 3.) New products can be added at any time
 *     a.) Menu option
 *
 * 4.) Production statistics can be displayed
 *     a.) Menu option
 *     b.) Total items produced
 *     c.) Number of each item
 *     d.) Number of unique products created
 *
 * 5.) Operator will decide when to stop the program
 *     a.) Menu option
 *
 * 6.) Program will be menu driven. Can be either:
 *     a.) Console program, or
 *     b.) Richer graphical user interface
 */

package JP_Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    // Write one line of code to create an ArrayList of products
    ArrayList<Product> arrProds = new ArrayList<Product>();

    /**
     * arrProds is being assigned the address of the ArrayList returned from testCollection()
     */
    arrProds = testCollection();

    // Write one line of code to sort the ArrayList
    Collections.sort(arrProds);

    // Call the print method on the ArrayList
    print(arrProds);

  }

  /**
   * I was originally going to pass the address of the ArrayList created in the main method and
   * assign it values rather than setting the address equal to the ArrayList object created in the
   * testCollection method. My version wouldn't have needed a second ArrayList created, but the
   * repl.it was having an issue, so I had to create the ArrayList object in the testCollection
   * method anyway.
   */

  public static ArrayList<Product> testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    // Write one line of code here to create the collection
    ArrayList<Product> products = new ArrayList<Product>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  /**
   * The print method simply runs through the contents of the ArrayList object passed as an argument
   * and prints each index on a separate line.
   *
   * This print method should work as generic.
   */
  public static void print(ArrayList<Product> arrProds) {
    for (Product elem : arrProds) {
      System.out.println(elem);
    }
  }


}
