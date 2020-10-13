package lab3;

public class Mail {
	// The sender of the item.
	private User sender = null;
	// The intended recipient.
	private User recipient = null;
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
	public Mail(User sender, User recipient, String message) {
		this.sender = sender;
		this.recipient = recipient;
		this.message = message;
	}

	/**
	 * @return The sender of this message.
	 */
	public String getSender() {
		return sender.toString();
	}

	/**
	 * @return The intended recipient of this message.
	 */
	public String getRecipient() {
		return recipient.toString();
	}

	/**
	 * @return The text of the message.
	 */
	public String getMessage() {
		return message;
	}

	private void isEmpty() {
		if (this.getMessage() == null || this.getMessage()=="") {
			this.message="** Something went wrong **";
		}
		}
	
	/**
	 * Print this mail message to the text terminal.
	 */
	public void print() {
		
		System.out.println("From: " + sender);
		System.out.println("To: " + recipient);
		this.isEmpty();
		System.out.println("Message: " + message);
	}
}




