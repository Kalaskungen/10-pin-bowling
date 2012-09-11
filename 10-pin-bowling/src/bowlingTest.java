
import static org.junit.Assert.*;

import org.junit.Test;


public class bowlingTest {


	@Test (expected = IllegalArgumentException.class)
	public void testRollIllegalRoll()  {
		Bowling b = new Bowling();
		b.roll(7, 5);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testStrikeRollIllegalRoll()  {
		Bowling b = new Bowling();
		b.roll(11);
	}
	
	@Test
	public void testRoll() {
		Bowling b = new Bowling();
		b.roll(5, 3);
		b.roll(3, 2);
		b.roll(5, 5);
		b.roll(2, 4);
		assertEquals(8, b.getFrameScore(1));
		assertEquals(5, b.getFrameScore(2));
		assertEquals(12, b.getFrameScore(3));
		assertEquals(6, b.getFrameScore(4));
	}
	
	@Test
	public void testStrikeRoll() {
		Bowling b = new Bowling();
		b.roll(10);
		b.roll(1, 5);
		assertEquals(16, b.getFrameScore(1));
	}
	
	@Test
	public void testGetScoreSum() {
		Bowling b = new Bowling();
		assertEquals(0, b.getScoreSum());
	}

}
