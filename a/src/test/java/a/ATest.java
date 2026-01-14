package a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ATest {
    @Test
    void testHello() {
        assertEquals("Hello from A", new A().hello());
    }
}
