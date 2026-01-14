package b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import a.A;

public class BTest {
    @Test
    void testHello() {
        assertEquals("Hello from A, and B", new B().hello());
    }
}
