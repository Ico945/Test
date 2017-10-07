package MinimumPathSum;

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {{0,1},{1,0}};
        new MinimumPathSum().minPathSum(grid);
    }
    public int minPathSum(int[][] grid) {
        int[][] matrix = new int[grid.length][grid[0].length];
        matrix[0][0] = grid[0][0];
        for(int i = 1;i<matrix.length;i++)
            matrix[i][0] = matrix[i-1][0]+grid[i][0];
        for(int i = 1;i<matrix[0].length;i++)
            matrix[0][i] = matrix[0][i-1]+grid[0][i];
        for(int i = 1;i<matrix.length;i++)
            for(int j = 1;j<matrix[0].length;j++)
                matrix[i][j] = grid[i][j]+ Math.min(matrix[i][j-1],matrix[i-1][j]);
        return matrix[matrix.length-1][matrix[0].length-1];
    }
}
