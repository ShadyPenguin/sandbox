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
public class euler01Test {

  private static HashSet<Integer> answer = new HashSet<>();

  @Test
  public void multiplesOfThree() {
    assertTrue(euler01.isMultipleOfThree(3));
    assertFalse(euler01.isMultipleOfThree(5));
  }


  @Test
  public void multiplesOfFive() {
    assertFalse(euler01.isMultipleOfFive(3));
    assertTrue(euler01.isMultipleOfFive(5));
  }

  @Test
  public void multiples_10() {
    answer.add(3);
    answer.add(5);
    answer.add(6);
    answer.add(9);
    answer.add(10);
    assertEquals(answer, euler01.findMultiples(10));
  }

  @Test
  public void sumMultiples() {
    assertEquals(23, (int) euler01.sumMultiples(10));
  }

  @After
  public void tearDown() throws Exception {
    answer.clear();
  }
}
