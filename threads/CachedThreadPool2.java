// threads/CachedThreadPool2.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
import java.util.concurrent.*;

public class CachedThreadPool2 {
  public static void main(String[] args)
    throws InterruptedException {
    ExecutorService exec =
      Executors.newCachedThreadPool();
    for(int id = 0; id < 10; id++)
      exec.execute(new InterferingTask(id));
    exec.shutdown();
    exec.awaitTermination(5, TimeUnit.SECONDS);
  }
}
/* Output:
0 pool-1-thread-1 200
4 pool-1-thread-5 300
3 pool-1-thread-4 400
1 pool-1-thread-2 200
2 pool-1-thread-3 200
6 pool-1-thread-7 500
8 pool-1-thread-9 757
5 pool-1-thread-6 657
7 pool-1-thread-8 657
9 pool-1-thread-10 857
*/
