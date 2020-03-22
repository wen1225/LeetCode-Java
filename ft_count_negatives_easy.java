//1351. Count Negative Numbers in a Sorted Matrix
class Solution {
    public int countNegatives(int[][] grid) {
        //scan matrix row by row
        int count = 0;
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[row].length; col++){
                if (grid[row][col] < 0)
                    count++;
            }
        }
        return count;
    }
}
