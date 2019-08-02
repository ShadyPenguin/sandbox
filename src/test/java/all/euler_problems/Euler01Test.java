package all.euler_problems;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Jake Sikora
 * @since 08/2019
 */
public class Euler01Test {
  @Test
  public void multiplesOfThree() {
    assertTrue(Euler01.isMultipleOfThree(3));
    assertFalse(Euler01.isMultipleOfThree(5));
  }

  @Test
  public void multiplesOfFive() {
    assertFalse(Euler01.isMultipleOfFive(3));
    assertTrue(Euler01.isMultipleOfFive(5));
  }

  @Test
  public void multiples_10() {
    Integer[] numbers = new Integer[]{3, 5, 6, 9};
    assertEquals(new HashSet<>(Arrays.asList(numbers)), Euler01.findMultiples(10));
  }

  @Test
  public void sumMultiples() {
    assertEquals(23, (int) Euler01.sumMultiples(10));
  }
}
