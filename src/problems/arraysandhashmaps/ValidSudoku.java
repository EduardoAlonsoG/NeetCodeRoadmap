package problems.arraysandhashmaps;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> rowsNumbers = new HashSet<>();
        Set<String> columsNumbers = new HashSet<>();
        Set<String> boxNumbers =  new HashSet<>();
        for(int row = 0; row < board[0].length ; row ++){
            for(int column = 0; column < board.length ; column ++){
                char currentElement = board[row][column];
                if(currentElement == '.') continue;
                if(!rowsNumbers.add(row+":"+currentElement))
                    return false;
                if(!columsNumbers.add(column+":"+currentElement))
                    return false;
                if(!boxNumbers.add((row/3)+","+(column/3)+":"+currentElement))
                    return false;

            }
        }

        return true;
    }
}
