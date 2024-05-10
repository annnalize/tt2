import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigInteger;

public class OperationsTest {

    @Test
    public void test_min() {
        int [] mas = {7, 4, 9, 8, 1};
        assertEquals(1, Operations._min(mas));
    }

    @Test
    public void test_max() {
        int[] mas = {7, 4, 9, 8, 1};
        assertEquals(9, Operations._max(mas));
    }

    @Test
    public void test_sum() {
        int[] mas = {7, 4, 9, 8, 1};
        assertEquals(29, Operations._sum(mas));
    }

    @Test
    public void test_mult() {
        int[] mas = {7, 4, 9, 8, 1};
        BigInteger expected = new BigInteger("2016");
        assertEquals(expected, Operations._mult(mas));
    }
}
