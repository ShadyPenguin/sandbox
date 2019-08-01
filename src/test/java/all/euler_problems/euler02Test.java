package all.euler_problems;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Jake Sikora
 * @since 08/2019
 */
public class euler02Test {

  @Test
  public void incrementTotal() {
    assertEquals(2L, euler02.evenTotal);
    euler02.incrementEvenTotal(1L);
    assertEquals(2L, euler02.evenTotal);
    euler02.incrementEvenTotal(2L);
    assertEquals(4L, euler02.evenTotal);
  }

  @Test
  public void progressSequence() {
    assertEquals(1L, euler02.first);
    assertEquals(2L, euler02.second);
    assertEquals(3L, euler02.next);
    euler02.progressSequence();
    assertEquals(2L, euler02.first);
    assertEquals(3L, euler02.second);
    assertEquals(5L, euler02.next);
    euler02.progressSequence();
    assertEquals(3L, euler02.first);
    assertEquals(5L, euler02.second);
    assertEquals(8L, euler02.next);
  }

  @Test
  public void sumEvenFibonacci() {
    assertEquals(10L, euler02.sumEvenFibonacci(12));
    assertEquals(44, euler02.sumEvenFibonacci(50));
  }

  @After
  public void tearDown() throws Exception {
    euler02.reset();
  }
}
