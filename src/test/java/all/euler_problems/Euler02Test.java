package all.euler_problems;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Jake Sikora
 * @since 08/2019
 */
public class Euler02Test {

  @Test
  public void incrementTotal() {
    assertEquals(2L, Euler02.evenTotal);
    Euler02.incrementEvenTotal(1L);
    assertEquals(2L, Euler02.evenTotal);
    Euler02.incrementEvenTotal(2L);
    assertEquals(4L, Euler02.evenTotal);
  }

  @Test
  public void progressSequence() {
    assertEquals(1L, Euler02.first);
    assertEquals(2L, Euler02.second);
    assertEquals(3L, Euler02.next);
    Euler02.progressSequence();
    assertEquals(2L, Euler02.first);
    assertEquals(3L, Euler02.second);
    assertEquals(5L, Euler02.next);
    Euler02.progressSequence();
    assertEquals(3L, Euler02.first);
    assertEquals(5L, Euler02.second);
    assertEquals(8L, Euler02.next);
  }

  @Test
  public void sumEvenFibonacci() {
    assertEquals(10L, Euler02.sumEvenFibonacci(12));
    assertEquals(44, Euler02.sumEvenFibonacci(50));
  }

  @After
  public void tearDown() throws Exception {
    Euler02.reset();
  }
}
