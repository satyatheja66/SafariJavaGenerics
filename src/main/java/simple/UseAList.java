package simple;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseAList {

  // compiler is forced to build this in terms of Object []
  // this would be a potential "heap pollution"
//  public static void showAll(E ... sa) {
//  public static void showAll(String ... sa) {
  public static void showAll(String[] sa) {
    for (String s : sa) {
      System.out.println(s);
    }
  }
  public static void breakAList(List l) {
    l.add(0, LocalDate.now());
  }

  public static void main(String[] args) {
    List<LocalDate> lld = null;
    List<String> names =
        new ArrayList<>(List.of(/*LocalDate.now(), */"Alfred"));
//        new ArrayList<String>(List.of(LocalDate.now(), "Alfred"));
    names = Collections.checkedList(names, String.class); // or "".getClass()
    names.add("Fred");
    names.add("Jim");
//    names.add(LocalDate.now());

//    breakAList(names);
    String name = /*(String)*/names.get(0);
    System.out.println("Name is " + name);

    boolean b = true;
    // this "would be nice" :) but not legal
//    Serializable & Comparable obj = b ? "Hello" : 99;
    var obj =
        b ? "Hello" : 99;

  }
}
