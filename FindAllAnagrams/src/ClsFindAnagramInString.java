import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ClsFindAnagramInString 
{
	public static void main(String[] args)
	{
		String s = "cbaebabacd";
		String p = "abc";
		List<Integer> lst = findAnagrams(s,p);
		for(int i : lst)
			System.out.print(i+",");
		
	}
	public static List<Integer> findAnagrams(String s, String p)
	{
		List<Integer> resultlist = new ArrayList<Integer>();
		if(s==null || s.length() ==0 || p==null || p.length()==0 || s.length() < p.length())
			return resultlist;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : p.toCharArray())
		{
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		int counter = map.size();
		int start = 0, end = 0;
		while (end < s.length())
		{
			char current = s.charAt(end);
			if(map.containsKey(current))
			{
				map.put(current, map.get(current) - 1);
				if(map.get(current) == 0)
					counter --;
			}
			end++;
			while(counter == 0)
			{
				char c = s.charAt(start);
				if(map.containsKey(c))
				{
					map.put(c, map.get(c)+1);
					if(map.get(c) > 0)
						counter++;
				}
				if(end - start == p.length())
				{
					resultlist.add(start);
				}
				start++;
			}
		}
		return resultlist;
	}
}
