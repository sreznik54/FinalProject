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
        int i = 1;
        if(direction == 1){
            while (!game.getBoardCell(row + 1,col).isWall())
            {
                game.getBoardCell(row,col).setVisited(true);
                row += i;
                x = game.getBoardCell(row,col).getX();
                y = game.getBoardCell(row,col).getY();
                i++;
            }
        }
        else if(direction == 2){
            while (!game.getBoardCell(row,col + 1).isWall())
            {
                game.getBoardCell(row,col).setVisited(true);
                col += i;
                x = game.getBoardCell(row,col).getX();
                y = game.getBoardCell(row,col).getY();
                i++;
            }
        }
        else if(direction == 3){
            while (!game.getBoardCell(row - 1,col).isWall())
            {
                game.getBoardCell(row,col).setVisited(true);
                row -= i;
                x = game.getBoardCell(row,col).getX();
                y = game.getBoardCell(row,col).getY();
                i++;
            }
        }
        else if(direction == 4){
            while (!game.getBoardCell(row,col - 1).isWall())
            {
                game.getBoardCell(row,col).setVisited(true);
                col -= i;
                x = game.getBoardCell(row,col).getX();
                y = game.getBoardCell(row,col).getY();
                i++;
            }
        }
    }


    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x,y,50,50);
        g.setColor(Color.BLACK);
        g.drawOval(x,y,50,50);
    }
}
