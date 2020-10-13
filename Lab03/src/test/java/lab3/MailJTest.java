/**
 * @author Stella Kazamia
 */
package lab3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MailJTest {

	Email senderEmail = new Email("s.kazamia@surrey.ac.uk");
	User sender = new User("Stella Kazamia", senderEmail);

	Email recipientEmail = new Email("unknown@surrey.ac.uk");
	User recipient = new User("Unknown Unknown", recipientEmail);

	String message = "Hello, This is an example of complex objects.";

	Mail finalEmail = new Mail(sender, recipient, message);

	@Test
	public void lab3_testMailConstruction() {
		finalEmail = new Mail(sender, recipient, message);
		StringBuffer buffer = new StringBuffer();
		buffer.append("From: " + finalEmail.getSender() + "\n");
		buffer.append("To: " + finalEmail.getRecipient() + "\n");
		buffer.append("Message: " + finalEmail.getMessage());

		assertEquals("From: Stella Kazamia <s.kazamia@surrey.ac.uk>\n" + "To: Unknown Unknown <unknown@surrey.ac.uk>\n"
				+ "Message: Hello, This is an example of complex objects.", buffer.toString());

	}

	@Test
	public void lab3_testMailGetters() {
		assertEquals("Stella Kazamia <s.kazamia@surrey.ac.uk>", finalEmail.getSender());
		assertEquals("Hello, This is an example of complex objects.", finalEmail.getMessage());
	}

	@Test
	public void lab3_testMailPrint() {
		message = "This is an example of Complex Objects!";
		finalEmail = new Mail(sender, recipient, message);

		StringBuffer buffer = new StringBuffer();
		buffer.append("From: " + finalEmail.getSender() + "\n");
		buffer.append("To: " + finalEmail.getRecipient() + "\n");
		buffer.append("Message: " + finalEmail.getMessage());

		assertEquals("From: Stella Kazamia <s.kazamia@surrey.ac.uk>\n" + "To: Unknown Unknown <unknown@surrey.ac.uk>\n"
				+ "Message: This is an example of Complex Objects!", buffer.toString());
	}

	@Test
	public void lab3_testEmptyMail() {
		Mail emptyEmail = new Mail(sender, recipient, "");

		StringBuffer buffer = new StringBuffer();
		buffer.append("From: " + emptyEmail.getSender() + "\n");
		buffer.append("To: " + emptyEmail.getRecipient() + "\n");
		buffer.append("Message: ** Something went wrong! **");

		assertEquals("From: Stella Kazamia <s.kazamia@surrey.ac.uk>\n" + "To: Unknown Unknown <unknown@surrey.ac.uk>\n"
				+ "Message: ** Something went wrong! **", buffer.toString());

	}

}
