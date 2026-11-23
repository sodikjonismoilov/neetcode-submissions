class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int row = 0; row < 9; row++) {
            java.util.HashSet<Character> seenRow = new java.util.HashSet<>();
            java.util.HashSet<Character> seenCol = new java.util.HashSet<>();
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != '.' && !seenRow.add(board[row][col])) return false;
                if (board[col][row] != '.' && !seenCol.add(board[col][row])) return false;
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                java.util.HashSet<Character> seenBox = new java.util.HashSet<>();
                for (int r = i; r < i + 3; r++) {
                    for (int c = j; c < j + 3; c++) {
                        if (board[r][c] != '.' && !seenBox.add(board[r][c])) return false;
                    }
                }
            }
        }
        return true;
    }
}