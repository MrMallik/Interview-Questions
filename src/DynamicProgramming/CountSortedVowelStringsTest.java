package DynamicProgramming;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountSortedVowelStringsTest {

    private CountSortedVowelStrings csvs = new CountSortedVowelStrings();

    @Test
    void countVowelStrings() {
        assertEquals(csvs.countVowelStrings(2), 15);
        assertEquals(csvs.countVowelStrings(33), 66045);
    }
}