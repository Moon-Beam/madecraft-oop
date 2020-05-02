package examples;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PlayingWithJunit {

	@Test
 	public void testName() throws Exception {
		assertEquals(4, Calculator.add(2,2));
	}
}
