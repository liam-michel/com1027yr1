package lab6_exercise2;

import static org.junit.Assert.*;

import org.junit.Test;

public class HalfbacksJTest {

	Halfbacks halfback = new Halfbacks();

	@Test
	public void lab6_testInvalidAssignPlayer() {
		Player player1 = new Player("Lewis Ludlam", RugbyPosition.OPENSIDEFLANKER);
		halfback.assignHalfback(player1);
	}
	@Test
	public void lab6_testAssignPlayer() {
		Player player1 = new Player("Jacob Umaga", RugbyPosition.FLYHALF);
		halfback.assignHalfback(player1);
		assertEquals("0 - \n" + 
				"1 - Jacob Umaga FLYHALF\n", halfback.displayElements());

	}
	@Test
	public void lab6_testDisplayFullArray() {
		Player player1 = new Player("Rhys Priestland", RugbyPosition.FLYHALF);
		Player player2 = new Player("Jacob Umaga", RugbyPosition.FLYHALF);
		Player player3 = new Player("Willi Heinz", RugbyPosition.SCRUMHALF);
		
		halfback.assignHalfback(player1);
		halfback.assignHalfback(player2);
		halfback.assignHalfback(player3);

		assertEquals("0 - Willi Heinz SCRUMHALF\n" + 
				"1 - Jacob Umaga FLYHALF\n" + 
				"", halfback.displayElements());
	}
	
	@Test
	public void lab6_testGetFlyhalfPlayer() {
		Player player2 = new Player("Jacob Umaga", RugbyPosition.FLYHALF);
		Player player3 = new Player("Willi Heinz", RugbyPosition.SCRUMHALF);
		
		halfback.assignHalfback(player2);
		halfback.assignHalfback(player3);
		
		assertEquals("Jacob Umaga", halfback.getPlayer(RugbyPosition.FLYHALF));
	}
	@Test
	public void lab6_testGetScrumhalfPlayer() {
		Player player1 = new Player("Rhys Priestland", RugbyPosition.FLYHALF);
		Player player2 = new Player("Jacob Umaga", RugbyPosition.FLYHALF);
		Player player3 = new Player("Willi Heinz", RugbyPosition.SCRUMHALF);
		
		halfback.assignHalfback(player1);
		halfback.assignHalfback(player2);
		halfback.assignHalfback(player3);

		assertEquals("Willi Heinz", halfback.getPlayer(RugbyPosition.SCRUMHALF));
	}
	
	
}
