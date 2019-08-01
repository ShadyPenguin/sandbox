import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;

/**
 * Multiples of 3 and 5
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author Jake Sikora
 * @since 08/2019
 */
class euler01 {

  static Integer sumMultiples(int num) {
    return Integer.valueOf(RunnerUtil.run(() ->
        findMultiples(num).stream().reduce(0, Integer::sum)));
  }

  static HashSet<Integer> findMultiples(int num) {
    HashSet<Integer> multiples = new HashSet<>();
    for (int i = 1;i<num;i++) {
      if (isMultipleOfThree(i)) {
        multiples.add(i);
      } else if (isMultipleOfFive(i)) {
        multiples.add(i);
      }
    }
    return multiples;
  }

  static boolean isMultipleOfThree(int i) {
    return i % 3 == 0;
  }

  static boolean isMultipleOfFive(int i) {
    return i % 5 == 0;
  }

  public static void main(String[] args) {
    // TODO: Verify correct in UI
    System.out.println("Answer: " + euler01.sumMultiples(1000)); // 233168
  }
}
