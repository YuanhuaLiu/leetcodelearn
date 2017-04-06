import java.util.HashSet;

public class ValidSudoku {
	public static void main(String[] args) {
		
	}
	
	public boolean isValidSudoku(char[][] board){
		HashSet<Character> set =new HashSet<Character>();
		//check rows
		for (int i = 0; i < board.length; i++) {
			set.clear();
			for (int j = 0; j < board.length; j++) {
				if (board[i][j]!='.'&&!set.add(board[i][j])) {
					return false;
				}
			}
		}
		//check columns
		for (int j = 0; j < board.length; j++) {
			set.clear();
			for (int i = 0; i < board.length; i++) {
				if (board[i][j]!='.'&&!set.add(board[i][j])) {
					return false;
				}
			}
		}
		 // check each sub box, there're p*q sub-boxes
        int totalBoxes = board.length / 3;
        for (int p = 0; p < totalBoxes; p++) {
            for (int q = 0; q < totalBoxes; q++) {
                set.clear();
                for (int i = p * 3; i < p * 3 + 3; i++) {
                    for (int j = q * 3; j < q * 3 + 3; j++) {
                        if (board[i][j] != '.' && !set.add(board[i][j]))
                            return false;
                    }
                }
            }
        }
 
        return true;
	}
}
