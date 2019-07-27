import java.util.*;
public class BaseballScore {
	public static void main(String[] args){
		String[] ops = {"5","2","C","D","+"};
		int result = calPoints(ops);
		System.out.println("result = "+result);
	}
	public static int calPoints(String[] ops){
		int ans = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(String op: ops){
			if(op.equals("+")){
				int top = stack.pop();
				int newtop = top + stack.peek();
				stack.push(top);
				stack.push(newtop);
			}
			else if(op.equals("C")){
				stack.pop();
			}
			else if(op.equals("D")){
				stack.push(2 * stack.peek());
			}
			else{
				stack.push(Integer.valueOf(op));
			}
		}
		for(int score: stack){
			ans += score;
		}
		return ans;
	}
}
