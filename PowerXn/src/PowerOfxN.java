
public class PowerOfxN {
	public static void main(String[] args){
		int x = 10;
		int n = 3;
		double ans = myPow(x,n);
		System.out.println("ans = "+ans);
	}
	 private static double fastPow(double x, long n) {
	        if (n == 0) {
	            return 1.0;
	        }
	        double half = fastPow(x, n / 2);
	        if (n % 2 == 0) {
	            return half * half;
	        } else {
	            return half * half * x;
	        }
	    }
	    public static double myPow(double x, int n) {
	        long N = n;
	        if (N < 0) {
	            x = 1 / x;
	            N = -N;
	        }
	        return fastPow(x, N);
	    }
}
