package ValidSudoku;

import java.util.HashSet;

public class Solution {

    public boolean isValidSudoku(char[][] board) {
        int n = board.length;

        for(int i = 0; i < n; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();

            for(int j = 0; j < n; j++) {
                if(board[i][j] != '.' && !row.add(board[i][j])) {
                    return false;
                }
                if(board[j][i] !='.' && !col.add(board[j][i])) {
                    return false;
                }
            }
        }

        for(int r = 0; r < n / 3; r++) {
            for(int c = 0; c < n / 3; c++) {
                HashSet<Character> block = new HashSet<>();
                for(int i = r * 3; i < (r + 1) * 3; i++) {
                    for(int j=c*3; j<(c+1)*3; j++) {
                        if(board[i][j] !='.' && !block.add(board[i][j])) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

}
