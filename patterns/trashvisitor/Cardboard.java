// patterns/trashvisitor/Cardboard.java
// Cardboard for the visitor pattern.
package patterns.trashvisitor;
import patterns.trash.*;

public class Cardboard extends patterns.trash.Cardboard
    implements Visitable {
  public Cardboard(double wt) { super(wt); }
  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}