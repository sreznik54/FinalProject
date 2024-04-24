import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//Sam Reznik

public class Amaze implements KeyListener {
    private MazeCell[][] board;
    private Ball b;
    private AmazeVeiw window;

    public Amaze(){
        b = new Ball(this);
        board = new MazeCell[12][12];
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                board[i][j] = new MazeCell(i*50, j*50, true);
            }
        }
        this.window = new AmazeVeiw(this);
        window.addKeyListener(this);
        setMaze();
    }

    public void setMaze(){
        for (int i = 2; i < 9; i++)
        {
            for (int j = 1; j < 11; j++) {
                board[j][i].setWall(false);
            }
        }
        board[1][2].setWall(true);
        board[4][2].setWall(true);
        board[5][2].setWall(true);
        board[5][4].setWall(true);
        board[10][4].setWall(true);
        board[7][5].setWall(true);
        board[8][7].setWall(true);
        board[3][8].setWall(true);
        board[10][8].setWall(true);
        b.setX(board[1][3].getX());
        b.setY(board[1][3].getY());
        window.repaint();
    }

    public MazeCell[][] getBoard() {
        return board;
    }
    public MazeCell getBoardCell(int row, int col) {
        return board[row][col];
    }

    public void setBoard(MazeCell[][] board) {
        this.board = board;
    }

    public Ball getB() {
        return b;
    }

    public void setB(Ball b) {
        this.b = b;
    }

    public AmazeVeiw getWindow() {
        return window;
    }

    public void setWindow(AmazeVeiw window) {
        this.window = window;
    }
    public void keyTyped(KeyEvent e) {
        // Nothing required for this program.
        // However, as a KeyListener, this class must supply this method
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Nothing required for this program.
        // However, as a KeyListener, this class must supply this method
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // The keyCode lets you know which key was pressed
        switch(e.getKeyCode()) {
            case KeyEvent.VK_UP:
                b.move(1);
                break;
            case KeyEvent.VK_DOWN:
                b.move(2);
                break;
            case KeyEvent.VK_LEFT:
                b.move(3);
                break;
            case KeyEvent.VK_RIGHT:
                b.move(4);
                break;
        }
        window.repaint();
    }

    public static void main(String[] args) {
        Amaze maze = new Amaze();
    }


}
