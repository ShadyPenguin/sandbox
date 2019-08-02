package all.euler_problems;

import java.util.HashSet;
import java.util.concurrent.Callable;

import all.RunnerUtil;

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
class Euler01 {
  private static Callable question = () -> sumMultiples(1_000);

  static Integer sumMultiples(int num) {
    return findMultiples(num).stream().reduce(0, Integer::sum);
  }

  static HashSet<Integer> findMultiples(int num) {
    HashSet<Integer> multiples = new HashSet<>();
    for (int i = 1; i < num; i++) {
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
    System.out.println("Answer: " + RunnerUtil.run(question));
    //  Time taken in millis: 9
    //  Answer: 233168
  }
}
