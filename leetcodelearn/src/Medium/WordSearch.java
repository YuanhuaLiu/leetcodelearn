package Medium;
/*
 * »ØËÝ·¨
 */
public class WordSearch {
	public static void main(String[] args) {
		char[][] board={{'A','B','C'},
						{'D','E','F'}};
		System.out.println(exist(board, "ABEF"));
	}
	
	public static boolean exist(char[][]board,String word){
		if (word.length()==0) {
			return true;
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (word.charAt(0)==board[i][j]
						&&exist(board, word,0,i,j,new boolean[board.length][board[0].length],0)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean exist(char[][] board, String word, int pos, int i, int j,
            boolean[][] used, int from) {
 
        if (pos == word.length())
            return true;
        if (used[i][j] || board[i][j] != word.charAt(pos))
            return false;
 
        // for special case, {{'a'}}, "a"
        if (pos == word.length() - 1)
            return true;
 
        // mark it used
        used[i][j] = true;
        boolean temp;
 
        // up
        if (i > 0 && from != 1) {
            temp = used[i - 1][j];
            if (exist(board, word, pos + 1, i - 1, j, used, 3))
                return true;
            used[i - 1][j] = temp; // roll back
        }
 
        // left
        if (j > 0 && from != 2) {
            temp = used[i][j - 1];
            if (exist(board, word, pos + 1, i, j - 1, used, 4))
                return true;
            used[i][j - 1] = temp; // roll back
        }
 
        // down
        if (i < board.length - 1 && from != 3) {
            temp = used[i + 1][j];
            if (exist(board, word, pos + 1, i + 1, j, used, 1))
                return true;
            used[i + 1][j] = temp; // roll back
        }
 
        // right
        if (j < board[0].length - 1 && from != 4) {
            temp = used[i][j + 1];
            if (exist(board, word,  pos + 1, i, j + 1, used, 2))
                return true;
            used[i][j + 1] = temp; // roll back
        }
 
        return false;
    }
}
