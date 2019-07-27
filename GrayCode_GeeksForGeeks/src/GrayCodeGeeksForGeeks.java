//Java program to generate 
//n-bit gray codes 
import java.io.*; 
public class GrayCodeGeeksForGeeks {

//Function to convert 
//decimal to binary 
static void decimalToBinaryNumber(int x, 
								int n) 
{ 
	int []binaryNumber = new int[x]; 
	int i = 0; 
	while (x > 0) 
	{ 
		binaryNumber[i] = x % 2; 
		x = x / 2; 
		i++; 
	} 

	// leftmost digits are 
	// filled with 0 
	for (int j = 0; j < n - i; j++) 
		System.out.print('0'); 

	for (int j = i - 1; 
			j >= 0; j--) 
		System.out.print(binaryNumber[j]); 
} 

//Function to generate 
//gray code 
static void generateGrayarr(int n) 
{ 
	int N = 1 << n; 
	for (int i = 0; i < N; i++) 
	{ 

		// generate gray code of 
		// corresponding binary 
		// number of integer i. 
		System.out.print("i = "+i+", (i >> 1): "+(i >> 1)+", ");
		System.out.print(i+" ^ "+(i >> 1));
		int x = i ^ (i >> 1); 
		System.out.print(" = "+x+"\n");
		// printing gray code 
		//decimalToBinaryNumber(x, n); 

		//System.out.println(); 
	} 
} 

//Driver code 
public static void main (String[] args) 
{ 
	//int n = 3; 
	//generateGrayarr(n); 
	String str = " ";
	str = str.trim();
	System.out.println("str = "+str);
} 
} 


