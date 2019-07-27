import java.util.*;
import java.util.ArrayList;

public class ClsPascalTraingle {
	public static void main(String[] args)
	{
		int rowIndex = 4;
		List<Integer> result = new ArrayList<>();
		result.add(1);
		for(int i=1; i<rowIndex; i++)
		{
			for(int j=result.size()-2; j>=0; j--)
			{
				result.set(j+1, result.get(j)+result.get(j+1));
			}
			result.add(1);
			System.out.println(" " +result);
		}
	}
}
