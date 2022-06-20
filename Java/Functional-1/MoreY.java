/*
 * Given a list of strings, return a list where each string has "y" added at its start and end.
 */

import java.util.*;

public class MoreY {
    public static List<String> moreY(List<String> strings) {
        List<String> result = new ArrayList<String>();
        for (String s : strings) {
            result.add("y" + s + "y");
        }
        return result;
    }
}
