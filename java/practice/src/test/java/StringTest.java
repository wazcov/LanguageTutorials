import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class StringTest {

    @Test
    public void testCharacterCount() {

        HashMap<String, Long> testCharacterCountMap = new HashMap<>();
        testCharacterCountMap.put("a", 1L);
        testCharacterCountMap.put("p", 2L);
        testCharacterCountMap.put("l", 1L);
        testCharacterCountMap.put("e", 1L);

        assertEquals(Strings.getMapOfCharactersUsed("Apple"), testCharacterCountMap);
    }
}
