package ee.itcollage.level3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class  LargestNumbestTest {

    @Test
    public void pick_largest_of_2() {
        assertEquals(1, LargestNumber.pickLargest(1, 0));
        assertEquals(1, LargestNumber.pickLargest(0, 1));
    }

    @Test
    public void pick_largest_of_3() {
        assertEquals(1, LargestNumber.pickLargest(1, 0, -1));
        assertEquals(1, LargestNumber.pickLargest(0, 1, -1));
    }

    @Test
    public void pick_Absolute() {
        assertEquals(3, AbsoluteNumber.makeAbsolute(-3));
        assertEquals(13, AbsoluteNumber.makeAbsolute(-13));
        assertEquals(7, AbsoluteNumber.makeAbsolute(7));
    }
}
