public class WordAppend {
    public static String wordAppend(String[] strings) {
      // Loop over the given array of strings to build a result string like this: 
      // when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. 
      // Return the empty string if no string appears a 2nd time.
      // In other words: a string only counts if it appears twice.
      
      Map<String, Integer> map = new HashMap<String, Integer>();
      String result="";
      
      for (String str : strings) {
      
        if (!map.containsKey(str)) {
          map.put(str, 1);
        }
        else {
          int count = map.get(str);
          map.put(str, count + 1);
          
          if (map.get(str)!=1&&map.get(str)%2==0) result += str;
        }
      }
      return result;
    }
}
