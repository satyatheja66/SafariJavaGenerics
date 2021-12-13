package makearray;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class MakeArray {

  public static <F, E extends F> F[] asArray(List<E> input, Class<F> cl) {
    // cannot use super with a generic type parameter declaration, ONLY with ?
//  public static <E, F super E> F[] asArray(List<E> input, Class<F> cl) {
//    E[] res = (E[])new Object[input.size()];
//    E[] res = (E[]) Array.newInstance(cl, input.size());
    F[] res = (F[]) Array.newInstance(cl, input.size());

    int idx = 0;
    for(E e : input) {
      res[idx++] = e;
    }
    return res;
  }

  public static void main(String[] args) {
    List<String> names = List.of("Fred", "Jim", "Sheila");

//    String [] nameArray = asArray(names, LocalDate.class);
    Object [] nameArray = asArray(names, Object.class);
    nameArray[0] = new StringBuilder("Fred");
    System.out.println("Type of String is " + String.class);
    System.out.println("Type of String is " + "".getClass());
    System.out.println("Type of array returned is " + nameArray.getClass());
    System.out.println("> " + Arrays.toString(nameArray));
  }
}
