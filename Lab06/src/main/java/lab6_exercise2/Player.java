package lab6_exercise2;

public class Player {
	private String name;
	private RugbyPosition position;
	
	public Player(String name, RugbyPosition position) {
		this.name=name;
		this.position = position;
	}
	
	public String getName() {
		return this.name;
	}
	
	public RugbyPosition getPosition() {
		return this.position;
	}

}
