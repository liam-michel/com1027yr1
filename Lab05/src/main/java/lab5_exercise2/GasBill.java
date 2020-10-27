package lab5_exercise2;

import java.text.DecimalFormat;

public class GasBill {
	private String accountNumber;
	private double amount;
	private Customer customer;
	
	public GasBill(String accountnumber,double amount, Customer customer) {
		this.accountNumber=accountnumber;
		this.amount=amount;
		this.customer = customer;
		boolean foundMatch;
		foundMatch = this.accountNumber.matches("[0-9]{4}(-)[0-9]{4}(-)[0-9]{4}");
		if (foundMatch==false) {
			this.accountNumber="Invalid Account";
		}
		
		
		
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public String getCustomer() {
		return this.customer.getName() + ". " + this.customer.getSurname()  ;
		
	}
	
	public boolean checkAccountAccuracy() {
		if (this.accountNumber=="Invalid Account"){
			return false;
		}
		return true;
	}
	
	public String displayAccountDetails() {
		DecimalFormat moneyformat = new DecimalFormat("0.00");
		return("Gas Bill\n Account Number:"+this.accountNumber +"\n Customer:"+this.customer.getName()+". "+this.customer.getSurname()+"\n Amount due:"+moneyformat.format(this.amount));
	}
	
	

}
