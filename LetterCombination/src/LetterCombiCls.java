import java.util.Queue;
import java.util.LinkedList;
public class LetterCombiCls {
	public static void main(String[] args)
	{
		String digits = "23";
		Queue<String> queue = new LinkedList<>();
		String[] mapping = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs",
				"tuv","wxyz"};
		if(digits.length()>0)
			queue.offer("");
		for(int i=0; i<digits.length();i++)
		{
			int n = Character.getNumericValue(digits.charAt(i));
			
			while(queue.peek().length() == i)
			{
				String previous = queue.poll();
				for(char c:mapping[n].toCharArray())
				{
					queue.offer(previous + c);
				}
			}
		}
		
		System.out.println(queue);
	}

}
