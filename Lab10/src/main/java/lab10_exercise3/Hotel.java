package lab10_exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines the representation of an hotel in the charge system.
 * 
 * @author Stella Kazamia
 */
public class Hotel {

  /** The name of the hotel. */
  private String       name;

 
  /** The list of guests currently in the hotel. */
  private List<IGuest> guests = null;

  /**
   * Constructor requiring the name and rating of the hotel.
   * 
   * @param name
   *          The name of the hotel.
   * @param rating
   *          The rating of the hotel.
   */
  public Hotel(String name) {
    super();
    this.name = name;

    // Create the guest list.
    this.guests = new ArrayList<IGuest>();
  }

  /**
   * Adds a guest to the list of guests in the hotel.
   * 
   * @param guest
   *          The guest to add.
   */
  public void addGuest(IGuest guest) {
    // Add the guest. This assumes the guest is not null.
    this.guests.add(guest);
  }

  /**
   * @return the list guests at the hotel. (Note that it is not ideal to return the list, but simple for this example.)
   */
  public List<IGuest> getGuests() {
    return this.guests;
  }

  /**
   * @return the name of the hotel.
   */
  public String getName() {
    return this.name;
  }


  /**
   * Prints the list of guests at the hotel. This uses the string representation of each guest define by the toString method in the
   * interface.
   */
  public void printGuestList() {
    // Print out a preamble.
    System.out.println(this.name + " Hotel");
    System.out.println("Guest List");

    // Loop through all of the guests and print their details.
    for (IGuest guest : this.guests) {
      System.out.println(guest); // Uses toString().
    }
  }
}
