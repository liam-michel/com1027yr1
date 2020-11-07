package lab6_exercise2;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("Ryhs Priestland",RugbyPosition.FLYHALF);
		Player p2 = new Player("Mike Phillips",RugbyPosition.SCRUMHALF);
		Halfbacks halfbacks = new Halfbacks();
		halfbacks.assignHalfback(p1);
		halfbacks.assignHalfback(p2);
		System.out.println(halfbacks.displayElements());
		System.out.println(halfbacks.getPlayerBad(1));
		
		
		
	}

}
