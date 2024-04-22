import java.awt.event.KeyListener;
//Sam Reznik

public class Amaze implements KeyListener {
    private MazeCell[][] board;
    private Ball b;
    private AmazeVeiw window;

    public Amaze(){
        b = new Ball();
        board = new MazeCell[60][60];
        for (int i = 0; i < 60; i++)
        {
            for (int j = 0; j < 60; j++)
            {
                board[i][j] = new MazeCell(i*10, j*10, true);
            }
        }
        this.window = new AmazeVeiw(this);
    }

    public MazeCell[][] getBoard() {
        return board;
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
}
