
public class ClsMatrix {
	public static void main(String[] args)
	{
		int[][] matrix = {{1,3,3},{1,0,1},{1,1,0}};
		  Boolean isCol = false;
		  int R = matrix.length;
		  int C = matrix[0].length;
		
		for(int i=0;i<3; i++)
		{
			for(int j=0;j<3; j++)
			{
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println("");
		}
		
		// Since first cell for both first row and first column is the same i.e. matrix[0][0]
      // We can use an additional variable for either the first row/column.
      // For this solution we are using an additional variable for the first column
      // and using matrix[0][0] for the first row.
		for(int i=0; i<R; i++)
		{
			if(matrix[i][0]==0)
				isCol = true;
			
			for(int j=1;j<C;j++)
			{
				if(matrix[i][j]==0)
				{
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		for(int i=1; i<R; i++)
		{
			for(int j=1; j<C; j++)
			{
				if((matrix[i][0] == 0) || matrix[0][j]==0)
					matrix[i][j]=0;
			}
		}
		if(isCol)
		{
			for(int i=0; i<R; i++)
				matrix[i][0] = 0;
		}
		for(int i=0;i<3; i++)
		{
			for(int j=0;j<3; j++)
			{
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println("");
		}
		
		
		
	}
	
	

}
