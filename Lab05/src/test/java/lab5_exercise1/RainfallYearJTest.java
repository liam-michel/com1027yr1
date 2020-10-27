package lab5_exercise1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RainfallYearJTest {

	RainfallYear rainfall = new RainfallYear(2020);

	@Test
	public void lab5_testConstruction() {
		assertEquals(2020, rainfall.getYear());
		assertEquals(0, rainfall.getRainfallMonth("JANUARY"), 0);

	}

	@Test
	public void lab5_testInitialise() {
		double[] data = new double[] { 69, 43, 56, 52, 55, 53, 48, 57, 64, 68, 71, 71 };
		rainfall.enterData(data);
		assertEquals(69, rainfall.getRainfallMonth("JANUARY"), 0);

	}

	@Test
	public void lab5_testCalculateMean() {
		double[] data = new double[] { 73, 43, 56, 52, 55, 53, 48, 57, 64, 68, 71, 71};
		rainfall.enterData(data);
		assertEquals(56, rainfall.getRainfallMonth("MARCH"), 0);
		assertEquals(59.25, rainfall.calculateMeanRainfall(), 0);
	}

	@Test
	public void lab5_testHighest() {
		double[] data = new double[] { 50, 43, 56, 52, 40, 53, 48, 57, 64, 68, 71, 71 };
		rainfall.enterData(data);
		assertEquals(52, rainfall.getRainfallMonth("APRIL"), 0);
		assertEquals(71, rainfall.calculateHighestRainfall(), 0);
	}

	@Test
	public void lab5_testInvalidMean() {
		assertEquals(0, rainfall.calculateMeanRainfall(), 0);
	}

	@Test
	public void lab5_testInvalidHighest() {
		assertEquals(0, rainfall.calculateHighestRainfall(), 0);
	}

}
