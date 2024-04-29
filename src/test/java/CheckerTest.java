import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CheckerTest {

    @Test
    void CheckerTest() {
        Checker checker = new Checker();
    }

    @Test
    void LengthCheckTest1() {
        Checker checker = new Checker();
        int expected = 60;
        int actual = checker.lengthCheck("ASD", "DSA");

        assertEquals(expected, actual);
    }
}