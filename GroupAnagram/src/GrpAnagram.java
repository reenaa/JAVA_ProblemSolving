import java.util.List;
import java.util.*;
public class GrpAnagram {
	public static void main(String[] args){
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> lstAnagrams = new ArrayList<>();
		lstAnagrams = groupAnagrams(strs);
		System.out.println(lstAnagrams);
	}
	public static List<List<String>> groupAnagrams(String[] strs){
		HashMap<String, List<String>> map = new HashMap<>();
		for(String str: strs){
			char[] ary = str.toCharArray();
			Arrays.sort(ary);
			String sortedString = new String(ary);
			if(map.containsKey(sortedString)){
				map.get(sortedString).add(str);
			}
			else{
				List<String> list = new ArrayList<>();
				list.add(str);
				map.put(sortedString, list);
			}
			
		}
		return new ArrayList<List<String>>(map.values());
	}
}
