import static org.junit.Assert.*;

import org.junit.Test;

public class ApllicationTest {

	@Test
	public void test() {
		assertFalse(Application.validation("1"));
		assertFalse(Application.validation("s,s,d,c,s"));
		assertFalse(Application.validation("1,2,3 5,6"));
		assertFalse(Application.validation("-1,1,2,3,5"));
		assertTrue("Successful Case",Application.validation("24,25,26,28,29"));
	}

}
