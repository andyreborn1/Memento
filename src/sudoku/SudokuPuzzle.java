package sudoku;

import memento.ConcreteMemento;
import memento.Memento;

public class SudokuPuzzle {
    protected String[][] board;
    private final int ROWS;
    private final int COLUMNS;
    private final int BOXWIDTH;
    private final int BOXHEIGHT;
    private final String[] VALIDVALUES;

    public SudokuPuzzle(int rows, int columns, int boxwidth, int boxheight, String[] validvalues) {
        this.ROWS = rows;
        this.COLUMNS = columns;
        this.BOXWIDTH = boxwidth;
        this.BOXHEIGHT = boxheight;
        this.VALIDVALUES = validvalues;
        this.board = new String[ROWS][COLUMNS];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < this.ROWS; i++) {
            for (int j = 0; j < this.COLUMNS; j++) {
                this.board[i][j] = "";
            }
        }
    }

    @Override
    public String toString() {
        String str = "Game Board\n";
        for (int i = 0; i < this.ROWS; i++) {
            for (int j = 0; j < this.COLUMNS; j++) {
                str += this.board[i][j] + " ";
            }
            str += "\n";
        }

        return str + "\n";
    }

    public void makeMove(int row, int column, String value) {
        this.board[row][column] = value;
    }


    public Memento saveState() {
        return new ConcreteMemento(this.board);
    }

    public void restore(Memento state) {
        this.board = state.getState();
    }

    public int getROWS() {
        return ROWS;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    public int getCOLUMNS() {
        return COLUMNS;
    }

    public int getBOXWIDTH() {
        return BOXWIDTH;
    }

    public int getBOXHEIGHT() {
        return BOXHEIGHT;
    }

    public String[] getVALIDVALUES() {
        return VALIDVALUES;
    }
}