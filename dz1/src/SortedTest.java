
import org.junit.Test;
import static org.junit.Assert.*;

public class SortedTest {

    Sorted array = new Sorted();

    @Test
    public void Max() throws Exception {
        assertArrayEquals(new int[]{100, 50}, array.Max(new int[]{1, -2, -300, 100, 50, -60}));
        assertArrayEquals(new int[]{5, -1, -1, 12, -8, 43}, array.Max(new int[]{-10, 5, -1, -1, 12, -8, 43}));
        assertArrayEquals(new int[]{8, 9}, array.Max(new int[]{-11, -14, 1, 1, 1, 1, -5, 8, 9}));
        assertArrayEquals(new int[]{500}, array.Max(new int[]{40, -100, 200, 0, 4, -210, 500}));
        assertArrayEquals(new int[]{4, 5, 5, 6}, array.Max(new int[]{4, 5, 5, 6, -15, 6, 0}));
        assertArrayEquals(new int[]{115, 100000}, array.Max(new int[]{0, -16, 115, 100000, -19000, 1555}));
    }


}
