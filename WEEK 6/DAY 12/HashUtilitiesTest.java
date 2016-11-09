import org.junit.*;
import static org.junit.Assert.*;

public class HashUtilitiesTest {

	@Test

	public void testsMiddlingNumber() {

		HashUtilities hash = new HashUtilitiesTest();
		
		int input = 5670;
		int output = hash.shortHash(input);

		assertTrue(output < 1000);
		assertTrue(output > 0);
	}

}