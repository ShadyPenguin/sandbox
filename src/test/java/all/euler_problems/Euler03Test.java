package all.euler_problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Jake Sikora
 * @since 08/2019
 */
public class Euler03Test {

  @Test
  public void isPrime_false() {
    assertFalse(Euler03.isPrime(2));
    assertFalse(Euler03.isPrime(10));
    assertFalse(Euler03.isPrime(25));
    assertFalse(Euler03.isPrime(27));
  }

  @Test
  public void isPrime_true() {
    assertTrue(Euler03.isPrime(3));
    assertTrue(Euler03.isPrime(11));
    assertTrue(Euler03.isPrime(29));
    assertTrue(Euler03.isPrime(101));
  }

  @Test
  public void largestPrime() {
    assertEquals(-1, Euler03.largestPrimeFactor(3));
    assertEquals(3, Euler03.largestPrimeFactor(9));
    assertEquals(5, Euler03.largestPrimeFactor(25));
    assertEquals(7, Euler03.largestPrimeFactor(49));
  }
}
