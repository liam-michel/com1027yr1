package lab3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * @author Stella Kazamia
 */
public class MailSimpleJTest {

	MailSimple ms = new MailSimple("s.kazamia@surrey.ac.uk", "unknown@surrey.ac.uk", "Hello!");

	@Test
	public void lab3_testConstruction() {
		ms = new MailSimple("s.kazamia@surrey.ac.uk", "unknown@surrey.ac.uk", "Hello!");
	}

	@Test
	public void lab3_testGetters() {
		assertEquals("s.kazamia@surrey.ac.uk", ms.getSender());
		assertEquals("unknown@surrey.ac.uk", ms.getRecipient());
		assertEquals("Hello!", ms.getMessage());
	}

	@Test
	public void lab3_testPrint() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("From: " + ms.getSender() + "\n");
		buffer.append("To: " + ms.getRecipient() + "\n");
		buffer.append("Message: " + ms.getMessage());

		assertEquals("From: s.kazamia@surrey.ac.uk\n" + "To: unknown@surrey.ac.uk\n" + "Message: Hello!",
				buffer.toString());
	}

	@Test
	public void lab3_testSecondPrint() {
		ms = new MailSimple("unknown@surrey.ac.uk", "bugs.bunny@surrey.ac.uk", "Eh, what's up, Doc?");
		StringBuffer buffer = new StringBuffer();
		buffer.append("From: " + ms.getSender() + "\n");
		buffer.append("To: " + ms.getRecipient() + "\n");
		buffer.append("Message: " + ms.getMessage());

		assertEquals("From: unknown@surrey.ac.uk\n" + "To: bugs.bunny@surrey.ac.uk\n" + "Message: Eh, what's up, Doc?",
				buffer.toString());
	}
}
