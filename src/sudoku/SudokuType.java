package sudoku;

public enum SudokuType {
    NINEBYNINE(9, 9, 3, 3, new String[]{"1","2","3","4","5","6","7","8","9",});

    private final int rows;
    private final int columns;
    private final int boxWidth;
    private final int boxHeight;
    private final String[] validValue;

    SudokuType(int rows, int columns, int boxWidth, int boxHeight, String[] validValue) {
        this.rows = rows;
        this.columns = columns;
        this.boxWidth = boxWidth;
        this.boxHeight = boxHeight;
        this.validValue = validValue;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getBoxWidth() {
        return boxWidth;
    }

    public int getBoxHeight() {
        return boxHeight;
    }

    public String[] getValidValue() {
        return validValue;
    }
}
