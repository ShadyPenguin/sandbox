import java.util.HashSet;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Jake Sikora
 * @since 08/2019
 */
public class euler01Test {

  private static HashSet<Long> answer = new HashSet();

  @Test
  public void multiples_3() {
    answer.add(3L);
    assertEquals(euler01.findMultiples(3L), answer);
  }


  @Test
  public void multiples_5() {
    answer.add(3L);
    answer.add(5L);
    assertEquals(euler01.findMultiples(5L), answer);
  }

  @Test
  public void multiples_10() {
    answer.add(3L);
    answer.add(5L);
    answer.add(6L);
    answer.add(9L);
    answer.add(10L);
    assertEquals(euler01.findMultiples(10L), answer);
  }
  @After
  public void tearDown() throws Exception {
    answer.clear();
  }
}
