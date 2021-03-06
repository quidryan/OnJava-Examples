// patterns/trashvisitor/Paper.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
// Paper for the visitor pattern
package patterns.trashvisitor;
import patterns.trash.*;

public class Paper extends patterns.trash.Paper
    implements Visitable {
  public Paper(double wt) { super(wt); }
  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
