package memento;

import sudoku.SudokuPuzzle;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> moveHistory = new ArrayList<Memento>();
    private SudokuPuzzle puzzle = null;

    public Caretaker(SudokuPuzzle puzzle) {
        this.puzzle = puzzle;
    }

    public void backup(){
        this.moveHistory.add(this.puzzle.saveState());
    }

    public void undo(){
        if(moveHistory.isEmpty()) return;

        ConcreteMemento m = (ConcreteMemento) moveHistory.remove(moveHistory.size());
        this.puzzle.restore(m);
    }

}
