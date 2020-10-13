package lab3;

/**
 * A class to model a simple electronic mail. The item has sender and recipient
 * addresses and a message string.
// * 
// * @author Stella Kazamia
// */
public class MailSimple {
	// The sender of the item.
	private String sender = null;
	// The intended recipient.
	private String recipient = null;
	// The text of the message.
	private String message = null;

	/**
	 * Create a mail item from sender to the given recipient, containing the given
	 * message.
	 * 
	 * @param sender    The sender of this item.
	 * @param recipient The intended recipient of this item.
	 * @param message   The text of the message to be sent.
	 */
	public MailSimple(String sender, String recipient, String message) {
		this.sender = sender;
		this.recipient = recipient;
		this.message = message;
	}

	/**
	 * @return The sender of this message.
	 */
	public String getSender() {
		return sender;
	}

	/**
	 * @return The intended recipient of this message.
	 */
	public String getRecipient() {
		return recipient;
	}

	/**
	 * @return The text of the message.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Print this mail message to the text terminal.
	 */
	public void print() {
		System.out.println("From: " + sender);
		System.out.println("To: " + recipient);
		System.out.println("Message: " + message);
	}
}

