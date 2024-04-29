import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CheckerTest {

    private Checker checker;

    @BeforeEach
    void setUp() {
        checker = new Checker();
    }

    @Test
    void LengthCheckTest1() {
        double actual = checker.lengthCheck("ASD", "DSA");
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    void LengthCheckTest2() {
        double actual = checker.lengthCheck("A", "BB");
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void LengthCheckTest3() {
        double actual = checker.lengthCheck("AAABB", "BAA");
        int expected = 20;
        assertEquals(expected, actual);
    }


}