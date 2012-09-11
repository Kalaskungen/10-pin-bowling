
import static org.junit.Assert.*;

import org.junit.Test;


public class bowlingTest {


	@Test (expected = IllegalArgumentException.class)
	public void testRollIllegalRoll()  {
		Bowling b = new Bowling();
		b.roll(11);
	}
	
	@Test
	public void testRoll() {
		Bowling b = new Bowling();
		b.roll(5);
		assertEquals(5, b.getRollScore(0));
	}
	
	@Test
	public void testGetFrameScore() {
		Bowling b = new Bowling();
		assertEquals(0, b.getFrameScore());
	}

	@Test
	public void testGetScoreSum() {
		Bowling b = new Bowling();
		assertEquals(0, b.getScoreSum());
	}

}
