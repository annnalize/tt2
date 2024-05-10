import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;
import java.math.BigInteger;

public class Operations {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(Paths.get(args[0]), StandardCharsets.UTF_8);
            if (scanner.hasNextLine()) {
                String[] numbers = scanner.nextLine().split(" ");
                int[] mas = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    try {
                        mas[i] = Integer.parseInt(numbers[i]);
                    } catch (NumberFormatException e) {
                        break;
                    }
                }
                BigInteger mult = _mult(mas);
                System.out.println(_min(mas));
                System.out.println(_max(mas));
                System.out.println(_sum(mas));
                System.out.println(mult);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int _min(int[] mas) {
        int min = mas[0];
        for (int num : mas) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static int _max(int[] mas) {
        int max = mas[0];
        for (int num : mas) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static long _sum(int[] mas) {
        long sum = 0;
        for (int num : mas) {
            sum = sum + num;
        }
        return sum;
    }
    public static BigInteger _mult(int[] mas) {
        BigInteger mult = BigInteger.ONE;
        for (int num : mas) {
            BigInteger value = new BigInteger(String.valueOf(num));
            mult = mult.multiply(value);
        }
        return mult;
    }
}