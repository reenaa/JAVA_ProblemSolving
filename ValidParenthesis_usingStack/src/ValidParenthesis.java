import java.util.*;
public class ValidParenthesis {
	public static void main(String[] args){
		//String s = "[()]";
		String s = "[[[()]";
		if(isValid(s))
			System.out.print(s+" has Valid parenthesis");
		else 
			System.out.print(" Not Valid");
	}

public static boolean isValid(String s) {
    
    Stack<Character> stack = new Stack<Character>();
    for(char c: s.toCharArray()){
        if(c == '('){
            stack.push(')');
        }
        else if(c == '{'){
            stack.push('}');
        }
        else if(c == '['){
            stack.push(']');
        }
        else if(stack.isEmpty() || c!=stack.pop()){
            return false;
        }
    }
    return stack.isEmpty();
}
}
