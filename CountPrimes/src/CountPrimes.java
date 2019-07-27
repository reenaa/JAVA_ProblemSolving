
public class CountPrimes {
	public static void main(String[] args){
		int n = 20;
		int primeCount = 0;
		boolean[] notPrime = new boolean[n];
		
		for(int i=2; i<n; i++){
			if(notPrime[i] == false){
				primeCount++;
				System.out.println("Prime ="+i);
				for(int j=2; i*j<n; j++){
					notPrime[i*j] = true;
				}
			}
		}
		System.out.println("Total Prime count = "+primeCount);
	}
}
