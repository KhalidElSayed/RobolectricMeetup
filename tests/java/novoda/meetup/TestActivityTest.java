package novoda.meetup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestActivityTest {

	@Test
	public void testTheAddition() {
		TestActivity activity = new TestActivity();
		assertEquals("should be equal", 2, activity.veryComplexAdditionMethod(1, 1));
	}
}
