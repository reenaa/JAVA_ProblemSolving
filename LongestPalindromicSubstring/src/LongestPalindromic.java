
public class LongestPalindromic {
	static int maxlen = 0;
	static int palindromLeft = 0;
	public static void main(String[] args){
		
		String s = "babad";
		String longestPalinSubstr = "";
		for(int i=0; i<s.length();i++){
			 expandfromCenter(s,i,i);
			 expandfromCenter(s,i,i+1);
		}
		String palin = s.substring(palindromLeft, palindromLeft + maxlen);
		System.out.println("** Palindrom - "+palin);
	}
	public static void expandfromCenter(String s,int left, int right){
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            System.out.println("left = "+left+", right= "+right);
            System.out.println("Char = "+s.charAt(right));
            left--;
            right++;
        }
        int len = right-left-1;
        if(len > maxlen){
            maxlen = len;
            palindromLeft = left+1;
            
        }
    }
}
