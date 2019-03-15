package pl.szymonkuhn.arrays.ships;

public class ShipBoardTest {

    public static void main(String[] args) {

        ShipBoard shipBoard = new ShipBoard();
        String[][] board = shipBoard.fillEmptyBoard(12,12);
        shipBoard.drawBoard(board);
        System.out.println();

        shipBoard.fillBoardWhithShip(board, "D",3);
        shipBoard.drawBoard(board);
        System.out.println();

        shipBoard.fillBoardWhithX(board, "A",4);
        shipBoard.drawBoard(board);
    }
}
