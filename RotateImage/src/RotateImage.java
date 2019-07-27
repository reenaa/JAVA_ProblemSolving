import java.util.*;
public class RotateImage {
	public static void main(String[] args){
		int[][] matrix = new int[][]{
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		rotate(matrix);
		int n = matrix.length;
		System.out.println("Rotated image: \n");
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
	 public static void rotate(int[][] matrix) {
	        int n = matrix.length;
	        
	        for(int i=0; i<n/2; i++){
	            for(int j=0; j<Math.ceil(((double)n)/2.0); j++){
	                System.out.println("i= "+i+", j= "+j);
	                swap(matrix,i,j,n);
	            }
	        }
	    }
	        public static void swap(int[][] a, int i, int j, int n){
	            System.out.println("a[i][j] = "+a[i][j]);
	            int temp = a[i][j];
	            a[i][j] = a[n-j-1][i];
	            a[n-j-1][i] = a[n-i-1][n-j-1];
	            a[n-i-1][n-j-1] = a[j][n-i-1];
	            a[j][n-i-1] = temp;
	        }
	    
}
