package lab9_exercise3;

public class TV extends AbstractItem{
	private static final double SALE_PERCENTAGE = 0.8;
	private int size;

	
	public TV(double price, int size) {
		super(price);
		this.size=size;
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

	public int getSize() {
		return this.size;
	}
	
	
	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		super.setPrice(price);
	}

	@Override
	public double calculateSalePrice() {
		// TODO Auto-generated method stub
		return super.getPrice()*SALE_PERCENTAGE;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "TV ("+this.size+"\")";
	}



	
	

}
