
public class PalindromeNumber {
	public static void main(String[] args){
		int number = 121;
		boolean b = chkPalindrome(number);
		if(b)
			System.out.println(number+" is Palindrome");
		else System.out.println(" Not Palindrome");
	}
	public static boolean chkPalindrome(int x){
		//Any negative number is not palindrome.
		//If last digit of the number is 0, then first digit also must be 0
		if(x < 0 || (x%10==0 && x!=0)){
			return false;
		}
		int revertedNum = 0;
		while(x > revertedNum){
			revertedNum = revertedNum * 10 + x%10;
			x = x/10;
		}
		if(x == revertedNum || x==revertedNum/10)
			return true;
		else
			return false;
	}
	
}
