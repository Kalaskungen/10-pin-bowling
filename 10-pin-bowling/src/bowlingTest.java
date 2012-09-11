
import static org.junit.Assert.*;

import org.junit.Test;


public class bowlingTest {

	@Test
	public void testDisplayRoll() {
		Bowling b = new Bowling(5);
		assertEquals(5, b.score);
	}

}
