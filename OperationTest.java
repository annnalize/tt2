import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class OperationTest {

    @Test
    public void test_min() {
        int [] mas = {4, -8, 5, 1, 0, 7, 9, 22};
        assertEquals(-8, Operations._min(mas));
    }

    @Test
    public void test_max() {
        int[] mas = {4, -8, 5, 1, 0, 7, 9, 22};
        assertEquals(22, Operations._max(mas));
    }

    @Test
    public void test_sum() {
        int[] mas = {4, -8, 5, 1, 0, 7, 9, 22};
        assertEquals(40, Operations._sum(mas));
    }

    @Test
    public void test_mult() {
        int[] mas = {4, -8, 5, 1, 0, 7, 9, 22};
        BigInteger expected = new BigInteger("0");
        assertEquals(expected, Operations._mult(mas));
    }
}