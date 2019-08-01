package all;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Callable;

/**
 * Utility class to get timers and print out the findings
 *
 * @author Jake Sikora
 * @since 08/2019
 */
public class RunnerUtil {
  public static String run(Callable<?> callable) {
    String answer = "";
    Instant start = Instant.now();
    try {
      answer = String.valueOf(callable.call());
    } catch (Exception e) {
      System.out.println("Threw an exception and dropping it on the floor. enjoy <3");
      e.printStackTrace();
      System.exit(9001);
    }
    System.out.println("Time taken in millis: " + Duration.between(start, Instant.now()).toMillis());
    return answer;
  }
}
