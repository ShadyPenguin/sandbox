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
  static HashSet<Long> findMultiples(long num) {
    HashSet<Long> multiples = new HashSet<Long>();
    for (long i = 1;i<=num;i++) {
      if (isMultipleOfThree(i)) {
        multiples.add(i);
      } else if (isMultipleOfFive(i)) {
        multiples.add(i);
      }
    }
    return multiples;
  }

  private static boolean isMultipleOfThree(long i) {
    return i % 3 == 0;
  }

  private static boolean isMultipleOfFive(long i) {
    return i % 5 == 0;
  }
}
