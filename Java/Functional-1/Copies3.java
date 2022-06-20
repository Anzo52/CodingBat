/*
  Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
*/

import java.util.ArrayList;
import java.util.List;


public class Copies3 {
  public static List<String> copies3(List<String> strings) {
    List<String> result = new ArrayList<String>();
    for (String s : strings) {
      result.add(s + s + s);
    }
    return result;
  }
}