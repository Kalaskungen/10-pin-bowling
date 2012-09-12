
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
		b.roll(3,5);
		b.roll(2,6);
		assertEquals(16, b.getScoreSum());
	}

	@Test
	public void testGetScoreSumWhenXFramesPlayed() {
		Bowling b = new Bowling();
		b.roll(3,5);
		b.roll(2,6);
		b.roll(4,2);
		assertEquals(16, b.getScoreSum(2));
	}

	@Test
	public void testFrameScore() {
		Bowling b = new Bowling();
		b.roll(3,5);
		assertEquals(8, b.getFrameScore(1));
	}

	@Test
	public void testLastFrameScore() {
		Bowling b = new Bowling();
		b.roll(3,5);
		b.roll(3,6);
		b.roll(1,3);
		assertEquals(4, b.getFrameScore());
	}

	@Test (expected = IllegalArgumentException.class)
	public void testTooLongGameNormal()  {
		Bowling b = new Bowling();
		for (int i = 0; i < 11; i++){
			b.roll(4, 3);
		}
	}

	@Test
	public void testBonusFrameStrikes()  {
		Bowling b = new Bowling();
		for (int i = 0; i < 12; i++){
			b.roll(10);
		}
		assertEquals(300, b.getScoreSum());
	}

	@Test
	public void testBonusFrameStrike11Spare12()  {
		Bowling b = new Bowling();
		for (int i = 0; i < 11; i++){
			b.roll(10);
		}
		b.roll(4,6);
		assertEquals(294, b.getScoreSum());
	}

	@Test
	public void testBonusFrameStrike10Spare11()  {
		Bowling b = new Bowling();
		for (int i = 0; i < 10; i++){
			b.roll(10);
		}
		b.roll(4,6);
		assertEquals(284, b.getScoreSum());
	}

	@Test
	public void testBonusFrameSpares()  {
		Bowling b = new Bowling();
		for (int i = 0; i < 11; i++){
			b.roll(5, 5);
		}
		assertEquals(150, b.getScoreSum());
	}

	@Test (expected = IllegalArgumentException.class)
	public void testTooLongGameSpares()  {
		Bowling b = new Bowling();
		for (int i = 0; i < 12; i++){
			b.roll(5, 5);
		}
	}

	@Test (expected = IllegalArgumentException.class)
	public void testTooLongGameStrikes()  {
		Bowling b = new Bowling();
		for (int i = 0; i < 13; i++){
			b.roll(10);
		}
	}
}
