package edu.pasadena.cs.cs03b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDummy {

    @Test
    public void testDummy() {
        int iResult = Dummy.dummy();
        assertEquals(0, iResult); // Test will pass if Dummy.dummy() returns 0
    }
}
