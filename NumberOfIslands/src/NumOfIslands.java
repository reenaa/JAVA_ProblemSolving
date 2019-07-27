
public class NumOfIslands {
	public static void main(String[] args)
	{
		int[][] grid = { {1,1,1,1,0},
						 {1,1,0,1,0},
						 {1,1,0,0,0},
						 {0,0,0,0,0},
					  };
		int nr = grid.length;
		int nc = grid[0].length;
		int islandCount = 0;
		
		System.out.println("rows="+nr+" cols="+nc);
		for(int i=0; i<nr; i++)
		{
			for(int j=0; j<nc; j++)
			{
				if(grid[i][j]==1)
				{
					dfsMerge(grid, i ,j);
					islandCount++;
				}
			}
		}
		System.out.println("Number of Islands = "+islandCount);	
	}
	public static void dfsMerge(int[][] grid, int i, int j)
	{
		int nr = grid.length;
		int nc = grid[0].length;
		if(i>=nr || j>=nc || i<0 || j<0 || grid[i][j]!=1)
			return;
		grid[i][j] = 0;
		dfsMerge(grid, i-1, j);
		dfsMerge(grid, i+1, j);
		dfsMerge(grid, i, j-1);
		dfsMerge(grid, i, j+1);
	}

}
