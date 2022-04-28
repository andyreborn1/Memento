package visual;

import sudoku.SudokuGenerator;
import sudoku.SudokuPuzzle;
import sudoku.SudokuType;

import javax.swing.*;
import java.awt.*;
import java.text.AttributedCharacterIterator;

public class SudokuPanel extends JPanel {

    private SudokuPuzzle puzzle;

    public SudokuPanel() {
        this.setPreferredSize(new Dimension(540, 450));
        this.puzzle = SudokuGenerator.generateRandomSudoku(SudokuType.NINEBYNINE);
        System.out.println(this.puzzle);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setColor(new Color(1.0f, 1.0f, 1.0f));

        graphics2D.fillRect(0, 0, this.getWidth(), this.getHeight());

        graphics2D.setColor(new Color(0.0f, 0.0f, 0.0f));
        int slotWidth = this.getWidth() / 9;
        int slotHeight = this.getHeight() / 9;

        for (int i = 0; i <= this.getWidth(); i += slotWidth) {
            if ((i / slotWidth) % 3 == 0) {
                graphics2D.setStroke(new BasicStroke(2));
            } else {
                graphics2D.setStroke(new BasicStroke(1));
            }
            graphics2D.drawLine(i, 0, i, this.getHeight());
        }

        for (int i = 0; i <= this.getHeight(); i += slotHeight) {
            if ((i / slotHeight) % 3 == 0) {
                graphics2D.setStroke(new BasicStroke(2));
            } else {
                graphics2D.setStroke(new BasicStroke(1));
            }
            graphics2D.drawLine(0, i, this.getWidth(),i);
        }

    }
}
