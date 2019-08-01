import java.util.concurrent.Callable;

/**
 * Even Fibonacci numbers
 * Problem 2
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 *
 * @author Jake Sikora
 * @since 08/2019
 */
public class euler02 {
  static long evenTotal = 2L;
  static long oddTotal = 1L;
  static long first = 1L;
  static long second = 2L;
  static long next = first + second;

  static long sumEvenFibonacci(long max) {
    while (next <= max) {
      progressSequence();
      incrementEvenTotal(second);
    }
    return evenTotal;
  }

  static void progressSequence() {
    first = second;
    second = next;
    next = second + first;
  }

  static void incrementEvenTotal(long num) {
    if (num % 2 == 0) {
      evenTotal += num;
    }
  }

  static void reset() {
    evenTotal = 2L;
    oddTotal = 1L;
    first = 1L;
    second = 2L;
    next = first + second;
  }

  public static void main(String[] args) {
    Callable call = () -> euler02.sumEvenFibonacci(4_000_000L);
    // TODO: verify in UI
    System.out.println("Answer: " + RunnerUtil.run(call)); // 4613732
  }
}
