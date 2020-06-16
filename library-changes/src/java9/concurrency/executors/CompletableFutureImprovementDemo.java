package java9.concurrency.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/**
 * In Java 9, CompletableFuture API is enhanced to support delayed
 * execution & timeouts. Few utility methods and better sub-classing 
 * have been added
 * 
 * @author saukedia1
 *
 */
public class CompletableFutureImprovementDemo {

    public static void main(String[] args) {
        Executor executor = CompletableFuture.delayedExecutor(5, TimeUnit.SECONDS);
        executor.execute(() -> System.out.println("Hello World! 5 secs delayed"));

        // Hold the main thread for 10 seconds to see the executor's message after 5 sec
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
