import java.util.HashMap;
import java.util.Stack;

public class ClsValidParenthesis 
{
	private String str;
	
	ClsValidParenthesis(String s)
	{
		str = s;
	}
	public static void main(String[] args)
	{
		//String str = "{{}}[]";
		String str = "{[}]";
		
		ClsValidParenthesis obj = new ClsValidParenthesis(str);
		if(obj.isValid(str))
			System.out.println(str +" is Valid Parenthesis");
		else
			System.out.println(str +" is Invalid Parenthesis");
	}
public boolean isValid(String s) 
{
    if(s == null || s.length()<0)
        return false;
    
    HashMap<Character, Character> map = new HashMap<Character, Character>();
    map.put('(', ')');
    map.put('[', ']');
    map.put('{', '}');
    
    Stack<Character> stk = new Stack<Character>(); 
    
    for(int i=0; i<s.length(); i++)
    {
        char curr = s.charAt(i);
        if(map.keySet().contains(curr))
        {
            stk.push(curr);
        }
        else if(map.values().contains(curr))
        {
            if(!stk.empty() && map.get(stk.peek())==curr)
                stk.pop();
            else
                return false;
        }
        
    }
    return stk.empty();
}
}