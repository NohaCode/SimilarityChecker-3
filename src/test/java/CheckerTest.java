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
        int actual = checker.lengthCheck("ASD", "DSA");
        int expected = 60;

        assertEquals(expected, actual);
    }

    @Test
    void LengthCheckTest2() {
        Checker checker = new Checker();
        int actual = checker.lengthCheck("A", "BB");
        int expected = 0;

        assertEquals(expected, actual);
    }


}