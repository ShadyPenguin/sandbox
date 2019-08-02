package all.euler_problems;

import java.util.concurrent.Callable;

import all.RunnerUtil;

/**
 * Largest prime factor
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 *
 * @author Jake Sikora
 * @since 08/2019
 */
class Euler03 {
  private static Callable question = () -> Euler03.largestPrimeFactor(600_851_475_143L);

  static long largestPrimeFactor(long num) {
    long i = 2;
    while (i < (num / 2)) {
      if (num % i == 0) {
        long largeFactor = num / i;
        if (isPrime(largeFactor)) {
          return largeFactor;
        }
      }
      i++;
    }
    return -1;
  }

  /**
   * Very primitive way to determine if a number is a prime number. This is the first method to
   * refactor if we run into timing issues.
   */
  static boolean isPrime(long num) {
    long halfway = num / 2;
    if (num % 2 == 0) {
      // Even Numbers cannot be prime because thy are all divisible by 2
      return false;
    }
    // Quarter the total iterations, could definitely do better than this.
    for (long i=3; i < halfway; i+=2) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Answer: " + RunnerUtil.run(question));
    //  Time taken in millis: 997
    //  Answer: 6857
  }
}
