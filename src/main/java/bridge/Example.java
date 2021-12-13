package bridge;

import java.util.List;

public class Example implements Comparable<Example> {
  List<String> ls;

  @Override
  public int compareTo(Example this, Example o) {
    return 0;
  }
//  @Override
//  public int compareTo(Object o) {
//    return 0;
//  }

  // NO NO NO, this is an overLOAD, NOT an overRIDE
//  @Override
//  public boolean equals(Example ex) {return false;}
}
