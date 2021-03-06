// generics/ListOfGenerics.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
import java.util.*;

public class ListOfGenerics<T> {
  private List<T> array = new ArrayList<>();
  public void add(T item) { array.add(item); }
  public T get(int index) { return array.get(index); }
}
