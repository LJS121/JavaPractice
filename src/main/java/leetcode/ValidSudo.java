package leetcode;

import org.junit.Test;

import java.util.HashSet;

/**
 * @author jinsong.Liang
 * @date 2019/3/29 16:41
 */
public class ValidSudo {
    public boolean isValidSudo(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            HashSet<Character> cubeSet = new HashSet<>();
            int rowIndex = 3 * (i / 3);
            int colIndex = 3 * (i % 3);
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.' && !rowSet.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !colSet.add(board[j][i])) {
                    return false;
                }
                char c = board[rowIndex + j / 3][colIndex + j % 3];
                if (c != '.' && !cubeSet.add(c)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void test() {

    }
}
