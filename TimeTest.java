import org.junit.Test;
import java.math.BigInteger;
import java.util.Random;

public class TimeTest {
    private static final int ARRAY_SIZE = 1000000;
    @Test
    public void _min() {
        int[] arr = new int[ARRAY_SIZE];
        Random rng = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            arr[i] = rng.nextInt(100000);
        }
        long startTime = System.nanoTime();
        int min = Operations._min(arr);
        long minTime = System.nanoTime() - startTime;
    }
    @Test
    public void _max() {
        int[] arr = new int[ARRAY_SIZE];
        Random rng = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            arr[i] = rng.nextInt(100000);
        }
        long startTime = System.nanoTime();
        int max = Operations._max(arr);
        long maxTime = System.nanoTime() - startTime;
    }
    @Test
    public void _sum() {
        int[] arr = new int[ARRAY_SIZE];
        Random rng = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            arr[i] = rng.nextInt(100000);
        }
        long startTime = System.nanoTime();
        long sum = Operations._sum(arr);
        long sumTime = System.nanoTime() - startTime;
    }
    @Test
    public void _mult() {
        int[] arr = new int[ARRAY_SIZE];
        Random rng = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            arr[i] = rng.nextInt(100000);
        }
        long startTime = System.nanoTime();
        BigInteger mult = Operations._mult(arr);
        long multTime = System.nanoTime() - startTime;
    }
}