package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiggerIsBetterTest {

    @Test
    void smallestStrGreaterThanThis() {
        assertEquals("ba", BiggerIsBetter.smallestStrGreaterThanThis("ab"));
        assertEquals("acb", BiggerIsBetter.smallestStrGreaterThanThis("abc"));
        assertEquals("hegf", BiggerIsBetter.smallestStrGreaterThanThis("hefg"));
        assertEquals("no answer", BiggerIsBetter.smallestStrGreaterThanThis("tkhc"));
    }
}