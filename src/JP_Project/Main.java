/**
 * This class will be restructured to perform the final step, step 23. This class must perform the
 * following:
 *
 * 1.) Allow user: a.) Add a new product b.) Specify how many items of that product should be
 * created.
 *
 * 2.) Program will then: a.) Create these items b.) Store them in a collection.
 *
 * 3.) New products can be added at any time a.) Menu option
 *
 * 4.) Production statistics can be displayed a.) Menu option b.) Total items produced c.) Number of
 * each item d.) Number of unique products created
 *
 * 5.) Operator will decide when to stop the program a.) Menu option
 *
 * 6.) Program will be menu driven. Can be either: a.) Console program, or b.) Richer graphical user
 * interface
 */

package JP_Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    ArrayList<Product> userCollection = new ArrayList<>();
    String prodName = "";
    int userOption = 0;
    int numCreated = 0;

    // The do-while loop runs through the menu until the user enters 3 to stop.
    do {
      userOption = menu(in);

      switch (userOption) {

        //Menu option 1 = add product
        case 1:
          prodName = getProdName(in);
          numCreated = getNumCreated(in);

          // This for loop creates new products of the one named by the user based on their number.
          for (int i = 0; i < numCreated; i++) {
            Product userProd = new Product(prodName);
            userCollection.add(userProd);
          }
          // print a blank line to separate the menu from rest of user input.
          System.out.println();
          break;

        //Menu option 2 = statistics
        case 2:
          printStatistics(userCollection);
          break;

        //Menu option 3 = exit application
        case 3:
          in.close();
          break;

        // User enters a number other than 3.
        default:
          System.out.println(userOption + " is not a valid option. Returning to menu.\n");
          break;
      }
    } while (userOption != 3);

    System.out.println("\nThank you for participating.");
  }


  /**
   * This method prints the menu for the user after each step finishes. It also takes input for the
   * option the user would like to select.
   *
   * @param in Scanner object representing input
   * @return int representing user's choice of menu option.
   */
  private static int menu(Scanner in) {
    System.out.println("1.) Add a product");
    System.out.println("2.) View product statistics");
    System.out.println("3.) Exit application");
    System.out.print("Please enter one of the above options: ");
    int userOption = in.nextInt();
    // Need to perform a nextLine action since nextInt leaves the newline character.
    in.nextLine();

    return userOption;
  }

  /**
   * This method collects input from the user for the product name.
   *
   * @param in Scanner object representing input
   * @return String literal of the product name
   */
  private static String getProdName(Scanner in) {
    System.out.print("Enter the name of the product: ");
    String prodName = in.nextLine();
    return prodName;
  }

  /**
   * This method collects input from the user for the number of this particular product to create.
   *
   * @param in Scanner object representing input
   * @return int representing how many of this particular product the user wants to create.
   */
  private static int getNumCreated(Scanner in) {
    System.out.print("How many of these items should be created: ");
    int numCreated = in.nextInt();
    // Need to perform a nextLine action since nextInt leaves the newline character.
    in.nextLine();
    return numCreated;
  }

  /**
   * This method receives an ArrayList of the user's products that has been sorted alphabetically as
   * a parameter. The purpose of this method is to print the three forms of output specified by the
   * assignment: total number of products, total number of unique products, and total number of
   * items of each unique product.
   *
   * @param userCollection ArrayList of user's products
   */
  private static void printStatistics(ArrayList<Product> userCollection) {
    System.out.println("\nProduct Statistics");

    //Total number of products
    System.out.println("Total items produced: " + userCollection.size());

    //Total number of unique items
    // Sort the ArrayList alphabetically
    Collections.sort(userCollection);
    int uniqueItems = getUniqueItems(userCollection);
    System.out.println("Total unique items produced: " + uniqueItems);

    //Total number of each unique item
    printNumOfEachProduct(userCollection, uniqueItems);

    System.out.println();
  }

  /**
   * This method determines how many unique items were created. Capitalizing matters in product
   * names. "Tooth brush" is considered a different product than "tooth brush". I could have used
   * the compareToIgnoreCase method in the Product class' compareTo method to prevent this, but I
   * chose not to since a product may or may not have what's considered to be a proper noun in its
   * name.
   *
   * @param userCollection ArrayList of the user's products
   * @return int value representing number of unique items.
   */
  private static int getUniqueItems(ArrayList<Product> userCollection) {
    int uniqueItems = 0;

    if (userCollection.size() > 0) {
      /**
       * This if-statement logic will only activate if userCollection has at least one item. The
       * logic of the for loop won't allow the first iteration to compare itself to the iteration
       * of -1, so I chose to immediately assign uniqueItems a value of 1 and to start the for loop
       * out at the second Product listed.
       */
      uniqueItems = 1;

      /**
       * This next if statement runs if there is more than 1 product in the collection.
       */
      if (userCollection.size() > 1) {
        for (int i = 1; i < userCollection.size(); i++) {

          /**
           * Since the ArrayList userCollection has been sorted alphabetically by product name,
           * any time the current product's name is different from the previous product would
           * indicate a new unique product.
           */
          if (userCollection.get(i).compareTo(userCollection.get(i - 1)) != 0) {
            uniqueItems++;
          }// end of if
        }// end of for
      }// end of if (more than one product in collection)
    }// end of if (at least one product in collection)
    else {
      System.out.println("No items have been created.");
      return uniqueItems; // still 0 at this point
    }// end of else
    return uniqueItems; // userCollection had more than 1 unique item
  }

  /**
   * This method prints out the total number produced of each unique item.
   *
   * @param userCollection ArrayList of the user's products
   * @param uniqueItems the number of unique items
   */
  private static void printNumOfEachProduct(ArrayList<Product> userCollection, int uniqueItems) {
    // Need an array of String objects to assign product names to and an array of int values to
    // keep track of which unique item is being written out.
    String[] nameOfProduct = new String[uniqueItems];
    int[] numOfProduct = new int[uniqueItems];
    // currItem is a counter variable for both nameOfProduct and numOfProduct
    int currItem = 0;

    if (userCollection.size() > 0) { // at least one product
      numOfProduct[0]++;
      nameOfProduct[0] = userCollection.get(0).getName(); // assigns name to first product

      if (userCollection.size() > 1) { // more than 1 product

        /**
         * This for loop utilizes the alphabetically sorted ArrayList and performs different tasks
         * depending on whether or not the two comparing product names are the same. If they are
         * the same, the number of that particular product is incremented. If the names are
         * different, then a new product is being accounted for; the else statement iterates the
         * counter variable, begins incrementing the number of products for this new product, and
         * assigns a name for this product
         */
        // the userCollection is still sorted alphabetically at this point
        for (int i = 1; i < userCollection.size(); i++) {
          if (userCollection.get(i).compareTo(userCollection.get(i - 1)) == 0) {
            numOfProduct[currItem]++;
          } // end of if
          else {
            currItem++;
            numOfProduct[currItem]++;
            nameOfProduct[currItem] = userCollection.get(i).getName();
          }// end of else
        }// end of for
      }// end of if (more than one product)
    }// end of if (at least one product)

    /**
     * This for loop prints the number of products created for each unique item.
     */
    for (int i = 0; i < numOfProduct.length; i++) {
      System.out.println("Total number of \"" + nameOfProduct[i] + "\": " + numOfProduct[i]);
    }
  }


  /**
   * The testCollection method was used in a previous iteration of the JP Project. Feel free to
   * skip
   *
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
