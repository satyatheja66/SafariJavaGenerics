package shopping;

public class Pair<E> {
  E left;
  E right;

  public Pair(E left, E right) {
    this.left = left;
    this.right = right;
  }

  // This design is probably bad, but...
  // better would be a "command pattern", i.e. caller
  // provides matching criteria (as a Predicate<E>)
  // ... The concept of "matches" is really domain/use-case
  // specific, NOT intrinsic to the Pair concept.
//  public boolean matches() {
//    // mess around with instanceof?? Yuk...
//    return left.getSize() == right.getSize();
//  }

  public E getLeft() {
    return left;
  }

  public void setLeft(E left) {
    this.left = left;
  }

  public E getRight() {
    return right;
  }

  public void setRight(E right) {
    this.right = right;
  }

  @Override
  public String toString() {
    return "Pair{" +
        "left=" + left +
        ", right=" + right +
        '}';
  }
}
