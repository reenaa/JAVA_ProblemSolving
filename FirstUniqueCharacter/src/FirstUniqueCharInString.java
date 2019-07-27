
public class FirstUniqueCharInString 
{
	public static void main(String[] args)
	{
		String abc = "welcome to leetcode world";
		int index = findFirstUniqueChar(abc);
		System.out.println("Unique character at "+index);
	}
	public static int findFirstUniqueChar(String s)
	{
		int[] arrForCharacters = new int[256];
		for(char c : s.toCharArray())
		{
			if(c==' ')
				continue;
			arrForCharacters[c-'a']++;
		}
		for(int i=0; i<s.length(); i++)
		{
			if(arrForCharacters[s.charAt(i)-'a'] == 1)
					return i;
		}
		
		return -1;
	}
}
