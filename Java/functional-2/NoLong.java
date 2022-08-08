// Given a list of strings, return a list of the strings, omitting any string length 4 or more.

import java.util.*;

public class NoLong {
    public List<String> noLong(List<String> strings) {
        strings.removeIf(s -> s.length() >= 4);
        return strings;
    }
}