import java.util.*;
public class StringCompressionCls {
	public static void main(String[] args)
	{
		char[] charArray = {'a','a','a','b','b','b','c'};
		int lengthCompressed = compress(charArray);
		System.out.println(lengthCompressed);
	}
	public static int compress(char[] chars) {
        //pointer to copy result in input array
        int k=0;
        
        //iterate over input array 
        for(int i = 0; i < chars.length; i++){
            int count = 1;
            //if char are same then increase the counter
            while(i < chars.length-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            //copy the result at slow pointer
            chars[k++]=chars[i];
            //if count is more than 1 then copy the numbers
            if(count > 1){
               char[] ary= String.valueOf(count).toCharArray();
                for(int j=0; j<ary.length;j++){
                    chars[k++]= ary[j];
                }
            }
            
        }
        //return slow pointer position as lenght of new array
        return k;
    }
}