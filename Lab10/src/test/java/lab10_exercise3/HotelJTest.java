package lab10_exercise3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class HotelJTest {

 /**
  * Dummy implementation of the IGuest interface.
  */
 public class Guest implements IGuest {

   /**
    * Adds a charge to a guest's record.
    * 
    * @param service
    *          The service the charge has been incurred for.
    * @param charge
    *          The value of the charge for the service.
    */
   @Override
   public void addCharge(Service service, double charge) {
     // Do nothing.
   }

   /**
    * Calculates the total charge for the guest without VAT as the total total charge for each service the guest has used.
    * 
    * @return The total charge for the guest without VAT.
    */
   @Override
   public double calculateTotalChargeWithoutVAT() {
     // Do nothing.
     return 0;
   }

   /**
    * Calculates the total VAT to be charged for all the charges that the guest has incurred at the specified VAT rate.
    * 
    * @param rate
    *          The required VAT rate.
    * 
    * @return The total VAT to charge at the specified rate.
    */
   @Override
   public double calculateVATChargeAtRate(VATRate rate) {
     // Do nothing.
     return 0;
   }

   /**
    * A string representation of the guest's details, including forename, surname, address and telephone number.
    * 
    * @return A string representation of the guest's details.
    */
   @Override
   public String toString() {
     return "Forename Surname, Address, Telephone";
   }
 }

 /**
  * Creating an Hotel object with a name. As part of your test, define a dummy implementation of the IGuest interface
  * that you can use to test the Hotel. Add two IGuests to your Hotel and test that the printGuestList method displays the details
  * of the two guests.
  */
 @Test
 public void testGuests() {
   Hotel hotel = new Hotel("Ritz");

   IGuest guest1 = new Guest();
   IGuest guest2 = new Guest();

   hotel.addGuest(guest1);
   hotel.addGuest(guest2);

   assertEquals(2, hotel.getGuests().size());

   hotel.printGuestList();
 }

 /**
  * Creating an Hotel object with a name. Testing that the name can be retrieved correctly and that the
  * list of guests is empty.
  */
 @Test
 public void testValid() {
	 Hotel hotel = new Hotel("Holiday Inn");

   assertEquals("Holiday Inn", hotel.getName());
   assertEquals(0, hotel.getGuests().size());
 }
 
 
}
