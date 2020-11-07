package lab6_exercise3;

public enum Medals {
	BRONZE(0),SILVER(1),GOLD(2);
	
	private int index;
	
	private Medals(int index) {
		this.index=index;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public static Medals[] orderedMedals() {
		Medals[] medals = new Medals[Medals.values().length];
		
		for (Medals medal: Medals.values()) {
			medals[medal.getIndex()]= medal;
		}
		
		return medals;
	}
}


