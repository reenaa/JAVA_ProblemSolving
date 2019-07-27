import java.util.*;
public class GrayCode {
	public static void main(String[] args){
		int n = 2;
		List<Integer> lst = grayCode(n);
		System.out.println(lst);
	}

//sequence is created by adding size to existing 
//element in reverse order and add the result to list
public static List<Integer> grayCode(int n) {
    List<Integer> result = new ArrayList<>();
    result.add(0);
   
    for(int i = 0; i < n; i++){
        int size = result.size();
        
        for(int j = size-1; j >=0; j--){
            result.add(result.get(j)+size);
        }
    }
    
  return result;
}
}
