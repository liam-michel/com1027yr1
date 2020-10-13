package lab2;
public class NumberInfo {
	private int limit;
	private int value;
	
	public NumberInfo(int limit) {
		super();
		this.limit=limit;
		this.value = 0;
		
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value=value;
		
	}
	
	public void increment() {
		this.value++;
		this.value = this.value % this.limit;
		
	}
	

}
