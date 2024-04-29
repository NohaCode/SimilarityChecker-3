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
    void LengthCheckTest_WhenSameLength1() {
        double actual = checker.lengthCheck("ASD", "DSA");
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    void LengthCheckTest_WhenSameLength2() {
        double actual = checker.lengthCheck("DSA", "ASD");
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    void LengthCheckTest_WhenLengthTwice1() {
        double actual = checker.lengthCheck("A", "BB");
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void LengthCheckTest_WhenLengthTwice2() {
        double actual = checker.lengthCheck( "BB", "A");
        int expected = 0;
        assertEquals(expected, actual);
    }



    @Test
    void LengthCheckTest_WhenSubPoint1() {
        double actual = checker.lengthCheck("AAABB", "BAA");
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    void LengthCheckTest_WhenSubPoint2() {
        double actual = checker.lengthCheck("BAA", "AAABB");
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    void LengthCheckTest_WhenSubPoint3() {
        double actual = checker.lengthCheck("AA", "AAE");
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    void LengthCheckTest_WhenSubPoint4() {
        double actual = checker.lengthCheck("AAE", "AA");
        int expected = 30;
        assertEquals(expected, actual);
    }


}