import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<Integer> createList(Integer... elems) {

        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void testEveryPath() {
        RuntimeException ex;

        //1, 2, 3.1, 3.2, 4, 5, 6, 7, 8, 9, 29
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(-1, -1, -1));
        assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));

        //1, 2, 3.1, 3.2, 4, 5, 6, 7, 8, 10, 11, 29
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(25, 1, 1));
        assertTrue(ex.getMessage().contains("The hours are grater than the maximum"));

        //1, 2, 3.1, 3.2, 4, 5, 6, 13, 14, 15, 29
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(20, -1, -1));
        assertTrue(ex.getMessage().contains("The minutes are not valid!"));

        //1, 2, 3.1, 3.2, 4, 5, 6, 13, 14, 16, 17, 19, 20, 29
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(20, 20, -1));
        assertTrue(ex.getMessage().contains("The seconds are not valid"));

        //1, 2, 3.1, 3.2, 4, 5, 6, 13, 14, 16, 17, 18, 21, 22, 27, 3.3, 3.2, 28, 29
        assertTrue(0 < SILab2.function(20, 20, 20) && 59 > SILab2.function(20, 20, 20));

        //1, 2, 3.1, 3.2, 4, 5, 6, 23, 24, 27, 3.3, 3.2, 28, 29
        assertTrue(SILab2.function(24, 0, 0));

        //1, 2, 3.1, 3.2, 4, 5, 6, 25, 26, 29
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(24, 600, -1));
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));
    }

    @Test
    void multipleConditionsTest() {
        //statement 7 (hr < 0 || hr > 24)
        //T || ?
        //F || T
        //F || F
        RuntimeException ex;

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(-1, 1, 1));
        assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(25, 1, 1));
        assertTrue(ex.getMessage().contains("The hours are grater than the maximum"));
        assertTrue(SILab2.function(20, 20, 20));

        //statement 14 (min < 0 || min > 59)
        //T || ?
        //F || T
        //F || F
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(20, -1, -1));
        assertTrue(ex.getMessage().contains("The minutes are not valid!"));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(20, 70, -1));
        assertTrue(ex.getMessage().contains("The minutes are not valid!"));
        assertTrue(SILab2.function(20, 20, 20));

    }

}