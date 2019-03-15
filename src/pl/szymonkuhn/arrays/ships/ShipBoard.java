package pl.szymonkuhn.arrays.ships;

public class ShipBoard {

    String fieldEmpty = "[ ]";
    String fieldShip = "[0]";
    String fieldX = "[X]";

    public String[][] fillEmptyBoard (int x, int y) {
        String [][] board = new String[x+1][y+1];
        board [0][0] = "lp ";
        for (int a = 1; a < board.length; a++) {
            board[0][a] = "[" + (char)(64+a) + "]" ;
        }
        for (int a = 1; a < board[0].length; a++) {
            board[a][0] = "[" + a + "}";
        }
        for (int i =1; i < board.length; i++) {
            for (int j=1; j < board[i].length; j++) {
                board[i][j] = fieldEmpty;
            }
        }
        return board;
    }


    public String[][] fillBoardWhithShip (String[][] board, String a, int y){
        int x = getIntFromString(a);
        board[y][x] = fieldShip;
        return board;
    }

    public String[][] fillBoardWhithX (String[][] board, String a, int y){
        int x = getIntFromString(a);
        board[y][x] = fieldX;
        return board;
    }

    public void drawBoard (String [][] board) {
        for (int i =0; i < board.length; i++) {
            for (int j=0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public int getIntFromString (String x){
        char a[] = x.toCharArray();
        return (Character.valueOf(a[0])-64);
    }

}
