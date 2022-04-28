package visual;

import javax.swing.*;
import java.awt.*;

public class SudokuFrame extends JFrame {

    private SudokuPanel sudokuPanel;

    public SudokuFrame() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Sudoku");
        this.setMinimumSize(new Dimension(800, 600));

        menu();
        panel();
    }

    private void panel() {
        JPanel windowPanel = new JPanel();
        windowPanel.setLayout(new FlowLayout());
        windowPanel.setPreferredSize(new Dimension(800, 600));

        sudokuPanel = new SudokuPanel();

        windowPanel.add(sudokuPanel);
        this.add(windowPanel);
    }

    private void menu() {
        Font fonte = new Font("Serif", Font.BOLD, 25);
        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("Novo Jogo");
        file.setFont(fonte);

        JMenuItem easy = new JMenuItem("Fácil");
        easy.setFont(fonte);
        JMenuItem medium = new JMenuItem("Médio");
        medium.setFont(fonte);
        JMenuItem hard = new JMenuItem("Difícil");
        hard.setFont(fonte);

        file.add(easy);
        file.add(medium);
        file.add(hard);

        menuBar.add(file);
        this.setJMenuBar(menuBar);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SudokuFrame frame = new SudokuFrame();
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }
}
