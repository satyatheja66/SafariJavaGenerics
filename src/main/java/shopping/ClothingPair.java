package shopping;

//public class ClothingPair<E extends Sized, String> extends Pair<E> {
//  java.lang.String s = "Hello";
// Following is of no value... (you can't assume it's either :)
//                      <E extends Sized | Colored>
public class ClothingPair<E extends Sized & Colored> extends Pair<E> {
  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public boolean matched() {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }
}

class Odd {
  int x;
  void x() {
    int x;
    System.out.println(this.x);
  }
}