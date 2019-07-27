
public class myAtoI {
	public static void main(String[] args){
		
	}
	public int myAtoi(String str) {
        int index = 0;
        int total = 0;
        int sign = 1;
        
        if(str.length()==0)
            return 0;
        
        while(index < str.length()){
            if(str.charAt(index)==' ')
                index++;
            else
                break;
        }
        
        if(str.charAt(index)=='+'){
            sign = 1;
            index++;
        }else if(str.charAt(index)=='-'){
            sign = -1;
            index++;
        }
        
        while(index < str.length()){
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9)
                break;
            if(total > Integer.MAX_VALUE/10 || total > (Integer.MAX_VALUE - digit)/10  )
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            
            total = total *10 + digit;
            index++;
        }
        
        return sign * total;
    }
}
