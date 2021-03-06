// logging/MultipleHandlers.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
// {ErrorOutputExpected}
import java.util.logging.*;

public class MultipleHandlers {
  private static Logger logger =
    Logger.getLogger("MultipleHandlers");
  public static void
  main(String[] args) throws Exception {
    FileHandler logFile =
      new FileHandler("MultipleHandlers.xml");
    logger.addHandler(logFile);
    logger.addHandler(new ConsoleHandler());
    logger.warning(
      "Output to multiple handlers");
  }
}
/* Output:
___[ Error Output ]___
Jul 27, 2016 10:50:43 AM MultipleHandlers main
WARNING: Output to multiple handlers
Jul 27, 2016 10:50:43 AM MultipleHandlers main
WARNING: Output to multiple handlers
*/
