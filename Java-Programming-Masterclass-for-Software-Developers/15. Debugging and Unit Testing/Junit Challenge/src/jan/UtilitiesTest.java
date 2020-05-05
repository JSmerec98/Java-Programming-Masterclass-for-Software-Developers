package jan;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    private Utilities util;

    @org.junit.jupiter.api.BeforeEach
    void setup() {
        util = new Utilities();
    }

    @org.junit.jupiter.api.Test
    void everyNthChar() {
        char[] output = util.everyNthChar(new char[] {'h','e','l','l','o'},2);
        assertArrayEquals(new char[] {'e','l'}, output);
        char[] output2 = util.everyNthChar(new char[] {'h','e','l','l','o'},8);
        assertArrayEquals(new char[] {'h','e','l','l','o'}, output2);
    }

    @org.junit.jupiter.api.Test
    void removeParis() {
        assertEquals("ABCDEF", util.removeParis("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removeParis("ABCCABDEEF"));
        assertNull(null, util.removeParis(null));
        assertEquals("A",util.removeParis("A"));
        assertEquals("",util.removeParis(""));
    }

    @org.junit.jupiter.api.Test
    void converter() {
        assertEquals(300, util.converter(10,5));
    }

    @org.junit.jupiter.api.Test
    void nullIfOddLength() {
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}