package c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import b.B;

public class CTest {
    @Test
    void testHello() {
        assertEquals("Hello from A, and B, and C", new C().hello());
    }
}
