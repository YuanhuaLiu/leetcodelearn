package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
	public static void main(String[] args) {
		
	}
	public List<String> anagrams(String[] strs){
		Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
             
            if (!map.containsKey(s))
                map.put(s, new ArrayList<String>());
            map.get(s).add(str);
        }
         
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size()>1) {
                list.addAll(entry.getValue());
            }
        }
         
        return list;
		
		
	}
}
