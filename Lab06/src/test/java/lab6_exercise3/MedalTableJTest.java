package lab6_exercise3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MedalTableJTest {

	MedalTable table = new MedalTable();

	@Test
	public void lab6_testTableConstruction() {
		assertEquals(0, table.getEUMedalCount());
	}

	@Test
	public void lab6_testGetMedalCount() {
		table.addMedal(Countries.CANADA, Medals.GOLD);
		table.addMedal(Countries.CHINA, Medals.GOLD);
		table.addMedal(Countries.FRANCE, Medals.SILVER);

		assertEquals(1, table.getEUMedalCount());

	}

	@Test
	public void lab6_testGetMedals() {
		table.addMedal(Countries.BRITAIN, Medals.GOLD);
		table.addMedal(Countries.CHINA, Medals.GOLD);
		table.addMedal(Countries.FRANCE, Medals.SILVER);

		assertEquals(0, table.getMedals(Countries.BRITAIN, Medals.BRONZE));
	}

	@Test
	public void lab6_testGetMedalsCanada() {
		table.addMedal(Countries.BRITAIN, Medals.GOLD);
		table.addMedal(Countries.CHINA, Medals.GOLD);
		table.addMedal(Countries.FRANCE, Medals.SILVER);

		assertEquals(0, table.getMedals(Countries.CANADA, Medals.SILVER));
	}
	
	@Test
	public void lab6_testGetMedalsFrance() {
		table.addMedal(Countries.BRITAIN, Medals.GOLD);
		table.addMedal(Countries.CHINA, Medals.GOLD);
		table.addMedal(Countries.FRANCE, Medals.SILVER);

		assertEquals(1, table.getMedals(Countries.FRANCE, Medals.SILVER));
	}

	
	
	@Test
	public void lab6_testCountriesIndex() {
		assertEquals(3, Countries.RUSSIA.getIndex());

	}
	
	
	@Test
	public void lab6_testMedalsIndex() {
		assertEquals(0, Medals.BRONZE.getIndex());
	}

	@Test
	public void lab6_testCountriesEU() {
		assertEquals(true, Countries.FRANCE.isEU());
	}

}
