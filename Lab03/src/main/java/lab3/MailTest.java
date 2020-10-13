/**
 * 
 */
package lab3;

/**
 * @author liamd
 *
 */
public class MailTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email senderemail= new Email("s.kazamia@surrey.ac.uk");
		User sender = new User("Stella Kazamia",senderemail);
		
		Email recipientemail= new Email("unknown@surrey.ac.uk");
		User recipient = new User("Unknown Unknown",recipientemail);
		
		String message = "Hello, this is an example of a complex object";
		
		Mail emptyEmail= new Mail(sender,recipient,"");
		emptyEmail.print();
		System.out.println();
		
		Mail finalEmail= new Mail(sender,recipient,message);
		finalEmail.print();
		
				
		
		

	}

}
