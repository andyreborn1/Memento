package sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SudokuGenerator {
    public static SudokuPuzzle generateRandomSudoku(SudokuType sudokuType) {
        SudokuPuzzle puzzle = new SudokuPuzzle(sudokuType.getRows(),
                sudokuType.getColumns(), sudokuType.getBoxWidth(),
                sudokuType.getBoxHeight(), sudokuType.getValidValue());

        Random rng = new Random();

        List<String> notUsedValues =
                new ArrayList<>(Arrays.asList(puzzle.getVALIDVALUES()));

        for (int i = 0; i < puzzle.getROWS(); i++) {
            int randomValue = rng.nextInt(notUsedValues.size());
            puzzle.makeMove(i, 0, notUsedValues.remove(randomValue));
        }

        return puzzle;
    }
}
