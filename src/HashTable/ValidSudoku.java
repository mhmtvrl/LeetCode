package HashTable;

import java.util.HashSet;


public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int column = board[0].length;
        //1.) 9 row 9 column 
        if(row != 9)
            return false;
        if(board[0].length != 9)
            return false;
            
        HashSet<Character> set = new HashSet<Character>();
        
        //1.)push rows check i in each iteration
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                char current = board[i][j];
                if(!set.contains(current) || current == '.'){
                    set.add(current);
                } 
                else {
                    return false;
                }
            }
            set = new HashSet<Character>();
        }
        
        set = new HashSet<Character>();
        //2.)add columns
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                char current = board[j][i];
                if(!set.contains(current) || current == '.'){
                    set.add(current);
                } 
                else {
                    return false;
                }
            }
            set = new HashSet<Character>();
        }
        
        for(int i = 0; i < row; i += 3) {
			for(int j = 0; j < column; j += 3){
				for(int k = i; k < i + 3; k++){
					for(int m = j; m < j + 3; m++){
						char current = board[k][m];
                        if(!set.contains(current) || current == '.'){
                            set.add(current);
                        } 
                        else {
                            return false;
                        }
					}
				}
				set = new HashSet<Character>();
			}
		}
        
        return true;
    }
}