// collectionsindepth/FillingLists.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
// The Collections.fill() & Collections.nCopies() methods
import java.util.*;

class StringAddress {
  private String s;
  public StringAddress(String s) { this.s = s; }
  @Override
  public String toString() {
    return super.toString() + " " + s;
  }
}

public class FillingLists {
  public static void main(String[] args) {
    List<StringAddress> list = new ArrayList<>(
      Collections.nCopies(4, new StringAddress("Hello")));
    System.out.println(list);
    Collections.fill(list, new StringAddress("World!"));
    System.out.println(list);
  }
}
/* Output:
[StringAddress@1db9742 Hello, StringAddress@1db9742 Hello,
StringAddress@1db9742 Hello, StringAddress@1db9742 Hello]
[StringAddress@106d69c World!, StringAddress@106d69c
World!, StringAddress@106d69c World!, StringAddress@106d69c
World!]
*/
