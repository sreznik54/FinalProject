import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
// Sam Reznik
// 05/09/2024
// AP CS2

public class Amaze implements KeyListener {

    public static final int UP = 4,
                            DOWN = 2,
                            RIGHT = 1,
                            LEFT = 3;
    private MazeCell[][] board;
    private Ball b;
    private AmazeVeiw window;
    private int moves;
    private boolean win;

    public Amaze(){
        b = new Ball(this);
        moves = 0;
        board = new MazeCell[12][12];
        // Sets a blank board where every cell is a wall
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                board[i][j] = new MazeCell(i*50, j*50);
                board[i][j].setWall(true);
            }
        }
        this.window = new AmazeVeiw(this);
        window.addKeyListener(this);
        setMaze();
    }

    // Set the actual maze
    public void setMaze(){
        // Sets a big rectangle as the maze
        for (int i = 2; i < 9; i++)
        {
            for (int j = 1; j < 11; j++) {
                board[j][i].setWall(false);
            }
        }
        // Adds inner walls to make the maze solvable
        board[1][2].setWall(true);
        board[5][2].setWall(true);
        board[6][2].setWall(true);
        board[5][4].setWall(true);
        board[10][4].setWall(true);
        board[7][5].setWall(true);
        board[8][7].setWall(true);
        board[4][8].setWall(true);
        board[10][8].setWall(true);
        // Sets the location of the ball
        b.setX(board[1][3].getX());
        b.setY(board[1][3].getY());
        board[1][3].setVisited(true);
        window.repaint();
    }

    // Returns the board
    public MazeCell[][] getBoard() {
        return board;
    }
    // Returns a given cell in the board
    public MazeCell getBoardCell(int row, int col) {
        return board[row][col];
    }

    public void setBoard(MazeCell[][] board) {
        this.board = board;
    }
    // Returns the Ball
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
    // Returns the number of moves done
    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
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
            // Moves in the direction of the arrow pressed
            case KeyEvent.VK_RIGHT:
                b.move(RIGHT);
                break;
            case KeyEvent.VK_DOWN:
                b.move(DOWN);
                break;
            case KeyEvent.VK_LEFT:
                b.move(LEFT);
                break;
            case KeyEvent.VK_UP:
                b.move(UP);
                break;
        }
        // Adds 1 to the number of moves
        moves++;
        if (moves > 25)
        {
            win = isWin();
        }
        window.repaint();
    }

    public boolean getWin(){
        return win;
    }

    // Return true if all squares have been visited
    public boolean isWin(){
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                if (!(board[i][j].isWall() || board[i][j].isVisited())){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Amaze maze = new Amaze();
    }


}
