
public class ReverseInteger {
	public static void main(String[] args){
		int num = 123;
		int reverseNum = reverseInteger(num);
		System.out.println("Integer reverse : "+reverseNum);
	}
	public static int reverseInteger(int num){
		int rev = 0;
		while(num!=0){
			int popNum = num % 10;
			num = num / 10;
			if((rev > Integer.MAX_VALUE/10) || (rev == Integer.MAX_VALUE/10) && (popNum >7))
				return 0;
			if((rev < Integer.MIN_VALUE/10) || (rev == Integer.MIN_VALUE/10) && popNum<-8)
				return 0;
			rev = rev * 10 + popNum;
		}
		return rev;
	}
}
