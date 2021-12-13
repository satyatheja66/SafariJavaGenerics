package taxation;

import java.util.List;

public class ListOAnything {
  // can be called with a list of anything:
  // List<String>
  // List<LocalDate>
//  public static void showThem(List<? extends Object> lo) {
  public static void showThem(List<?> lo) {
    for (Object o : lo)
    System.out.println("It's " + o.toString());
  }
  /*
  lo.add(new Object()); // NOPE
  lo.add("text"); // NOPE
  // assignment compatibility in inheritance/generalization
  // is UNIDIRECTIONAL!!!!
   */
}
