/*
Cells with Odd Values in a Matrix

Problem Statement :

Given n and m which are the dimensions of a matrix initialized by zeros and given an array indices where indices[i] = [ri, ci]. For each pair of [ri, ci] you have to increment all cells in row ri and column ci by 1.

Return the number of cells with odd values in the matrix after applying the increment to all indices.

Example 1:

	Input: n = 2, m = 3, indices = [[0,1],[1,1]]
	Output: 6
	Explanation: Initial matrix = [[0,0,0],[0,0,0]].
	After applying first increment it becomes [[1,2,1],[0,1,0]].
	The final matrix will be [[1,3,1],[1,3,1]] which contains 6 odd numbers.

Example 2:

	Input: n = 2, m = 2, indices = [[1,1],[0,0]]
	Output: 0
	Explanation: Final matrix = [[2,2],[2,2]]. There is no odd number in the final matrix.

Constraints:

    1 <= n <= 50
    1 <= m <= 50
    1 <= indices.length <= 100
    0 <= indices[i][0] < n
    0 <= indices[i][1] < m

*/


// Difficulty Level -- Easy


class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int output[][] = new int[n][m];
        
        for(int i=0;i<indices.length;i++) {
            
            output = modifyRow(indices[i][0], output);
            output = modifyCol(indices[i][1], output);
            
        }
        
        int countOdds = countOddNumbers(output);
        
        return countOdds;
    }
    
    public static int[][] modifyRow(int row, int output[][]) {
        
        for(int i=0;i<output[0].length;i++) {
            output[row][i]++;
        }
        
        return output;
    }
    
    public static int[][] modifyCol(int col, int output[][]) {
        
        for(int i=0;i<output.length;i++) {
            output[i][col]++;
        }
        
        return output;
    }
    
    public static int countOddNumbers(int output[][]) {
        int oddNumberCount = 0;
        
        for(int i=0;i<output.length;i++) {
            for(int j=0;j<output[i].length;j++) {
                if(output[i][j] %2 != 0) {
                    oddNumberCount++;
                }
            }
        }
        
        return oddNumberCount;
    }
        
}


/*

	Time complexity -- O(n*m)

	Space complexity -- O(n*m)

*/





