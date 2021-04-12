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
    void testTranformWhenDivByThree() {
        assertEquals("foo", fbb.transform(3)); // expected, actual
    }

    @Test
    void testTranformWhenDivByFive() {
        assertEquals("bar", fbb.transform(5));
    }

}
