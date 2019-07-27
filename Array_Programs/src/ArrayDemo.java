import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayDemo {
	public static void main(String[] args)
	{
		//usage of the dynamic array:
		List v0 = new ArrayList<>();
		List<Integer> v1;
		Integer[] a = {0,1,2,3,4};
		//Convert arrays to list
		v1 = new ArrayList<>(Arrays.asList(a));
		List<Integer> v2 = v1;					//Another reference to v1
		List<Integer> v3 = new ArrayList<>(v1); //make an actual copy of v1
		
	}
}
