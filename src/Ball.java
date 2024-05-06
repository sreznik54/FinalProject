import java.awt.*;

public class Ball {
    private static final int START_X = 60,
            START_Y = 60;
    private int x;
    private int y;
    private int row;
    private int col;
    private Amaze game;

    // Constructs the ball
    public Ball(Amaze game){
        this.game = game;
        this.x = START_X;
        this.y = START_Y;
        this.row = 1;
        this.col = 3;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int direction){

        if(direction == Amaze.RIGHT){
            MazeCell current = game.getBoardCell(row + 1, col);
            MazeCell past = game.getBoardCell(row, col);
            while (!current.isWall())
            {
                past = current;
                current = game.getBoardCell(row + 1, col);
                past.setVisited(true);
                row++;
            }
            x = past.getX();
            y = past.getY();
            row--;
        }
        else if(direction == Amaze.DOWN){
            MazeCell current = game.getBoardCell(row, col + 1);
            MazeCell past = game.getBoardCell(row, col);
            while (!current.isWall())
            {
                past = current;
                current = game.getBoardCell(row, col + 1);
                past.setVisited(true);
                col++;
            }
            x = past.getX();
            y = past.getY();
            col--;
        }
        else if(direction == Amaze.LEFT){
            MazeCell current = game.getBoardCell(row - 1, col);
            MazeCell past = game.getBoardCell(row, col);
            while (!current.isWall())
            {
                past = current;
                current = game.getBoardCell(row - 1, col);
                past.setVisited(true);
                row--;

            }
            x = past.getX();
            y = past.getY();
            row++;
        }
        else if(direction == Amaze.UP){
            MazeCell current = game.getBoardCell(row, col - 1);
            MazeCell past = game.getBoardCell(row, col);
            while (!current.isWall())
            {
                past = current;
                current = game.getBoardCell(row, col - 1);
                past.setVisited(true);
                col--;
            }
            x = past.getX();
            y = past.getY();
            col++;
        }
    }


    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x,y,50,50);
        g.setColor(Color.BLACK);
        g.drawOval(x,y,50,50);
    }
}
