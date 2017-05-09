package Medium;


public class UniquePathsII {
	public int uniquePathsWithObstacles(int[][] obstacleGrid){
		if (obstacleGrid.length==0||obstacleGrid[0].length==0||obstacleGrid[0][0]==1||obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1) {
			return 0;
		}
		Integer [][]visited=new Integer[obstacleGrid.length][obstacleGrid[0].length];
		return traverse(0,0,obstacleGrid,visited);
	}

	private int traverse(int i, int j, int[][] obstacleGrid, Integer[][] visited) {
		if (i==obstacleGrid.length-1&&j==obstacleGrid[0].length-1) {
			return 1;
		}
		int count = 0;
		if (i<obstacleGrid.length-1&&obstacleGrid[i+1][j]==0) {
			Integer val = visited[i+1][j];
			if (val==null) {
				val=traverse(i+1, j, obstacleGrid, visited);
				visited[i+1][j]=val;
			}
			count+=val;
		}
		if (j<obstacleGrid.length-1&&obstacleGrid[i][j+1]==0) {
			Integer val = visited[i][j+1];
			if (val==null) {
				val=traverse(i, j+1, obstacleGrid, visited);
				visited[i][j+1]=val;
			}
			count+=val;
		}
		return count;
	}
}
