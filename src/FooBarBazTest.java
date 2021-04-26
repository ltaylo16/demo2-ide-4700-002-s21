import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FooBarBazTest {

	private FooBarBaz fbb;
	
	@BeforeEach
	void setUp() {
			this.fbb = new FooBarBaz();
	}
	
	@Test
	void testTransformWhenDivByFifteen() {
		assertEquals("foobar", fbb.transform(15));
	}
	
	@Test
	void testTransformWhenDivByTwentyOne() {
		assertEquals("foobaz", fbb.transform(21));
	}
	@Test
	void testTransformWhenDivByThirtyFive() {
		assertEquals("barbaz", fbb.transform(35));
	}

}
