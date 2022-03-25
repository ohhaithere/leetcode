package SearchA2DMatrix;

public class Solution {

    static boolean binarySearch(int mat[][], int t,int i,int j ,int r){

        while(i <= r)
        {
            if(mat[i][0] == t) return true; // checking at starting column index
            if(mat[i][j]== t) return true; // checking at n-1 column index

            // condition to check the target range
            if(mat[i][0] < t && mat[i][j] < t)
            {
                i++;
            }
            else
            {
                // traverse along column
                for(int k=0;k<j;k++)
                {
                    if(mat[i][k] == t) return true;
                }
                return false;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        // if(c == 0) return false;
        boolean ans = binarySearch(matrix,target,0,c-1,r-1);
        if(ans)
        {
            return true;
        }
        return false;
    }

}
