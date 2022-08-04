/* Given a list of strings, return a list of the strings, omitting any string that contains a "z". 
 * (Note: the str.contains(x) method returns a boolean)
 */

import java.util.*;

public class NoZ {
	public List<String> noZ(List<String> strings) {
		strings.removeIf(s -> s.contains("z"));
		return strings;
	}
}
