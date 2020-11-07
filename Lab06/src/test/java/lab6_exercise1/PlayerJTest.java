package lab6_exercise1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerJTest {

	Player player = new Player("Rhys Priestland", RugbyPosition.FLYHALF);

	@Test
	public void lab6_testConstruction() {
		assertEquals("Rhys Priestland", player.getName());
		assertEquals(RugbyPosition.FLYHALF, player.getPosition());

	}

	@Test
	public void lab6_testSecondObject() {
		player = new Player("George Furbank", RugbyPosition.FULLBACK);
		assertEquals("George Furbank", player.getName());
		assertEquals(RugbyPosition.FULLBACK, player.getPosition());

	}

	
}
