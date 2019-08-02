package all.euler_problems;

import java.util.concurrent.Callable;

import org.junit.Test;

import all.RunnerUtil;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Jake Sikora
 * @since 08/2019
 */
public class euler03Test {

  @Test
  public void isPrime_false() {
    assertFalse(euler03.isPrime(2));
    assertFalse(euler03.isPrime(10));
    assertFalse(euler03.isPrime(25));
    assertFalse(euler03.isPrime(27));
  }

  @Test
  public void isPrime_true() {
    assertTrue(euler03.isPrime(3));
    assertTrue(euler03.isPrime(11));
    assertTrue(euler03.isPrime(29));
    assertTrue(euler03.isPrime(101));
  }

  @Test
  public void largestPrime() {
    assertEquals(-1, euler03.largestPrimeFactor(3));
    assertEquals(3, euler03.largestPrimeFactor(9));
    assertEquals(5, euler03.largestPrimeFactor(25));
    assertEquals(7, euler03.largestPrimeFactor(49));
  }
}
