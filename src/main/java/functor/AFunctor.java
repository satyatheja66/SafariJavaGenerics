package functor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

// A bucket o'data with a map operation that
// creates a new bucket o'data containing the
// results of the map operation is (kinda-sorta)
// called a "Functor"
public class AFunctor {
  public static <A, R> List<R> map(
      List<A> data, Function<? super A, ? extends R> op) {
    List<R> res = new ArrayList<>();
    for (A a : data) {
      R r = op.apply(a);
      res.add(r);
    }
    return res;
  }

  public static void main(String[] args) {
    List<String> ls = List.of("Fred", "Jim", "Sheila");
//    Function<String, Integer> lenFun = s -> s.length();
    Function<CharSequence, Integer> lenFun = s -> s.length();
    List<Number> lengths = map(ls, lenFun);
    System.out.println(lengths);

    List<StringBuilder> lsb = List.of(new StringBuilder("Fred"),
        new StringBuilder("Jim"),
        new StringBuilder("Sheila"));
//    Function<StringBuilder, Integer> fsbi = s -> s.length();
    List<Number> lensAgain = map(lsb, lenFun);

  }
}
