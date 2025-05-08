import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeCheckerTest {

    @Test
    public void testPrimeNumbers() {
        assertTrue(PrimeChecker.isPrime(2));
        assertTrue(PrimeChecker.isPrime(3));
        assertTrue(PrimeChecker.isPrime(13));
    }

    @Test
    public void testNonPrimeNumbers() {
        assertFalse(PrimeChecker.isPrime(1));  // bao phủ if (number <= 1)
        assertFalse(PrimeChecker.isPrime(4));  // bao phủ vòng lặp và điều kiện chia hết
    }
}
