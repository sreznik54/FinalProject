import java.awt.*;

public class MazeCell {
    private int x;
    private int y;
    private boolean visited;
    private boolean wall;

    // Constructs the cell
    public MazeCell(int x, int y)
    {
       this.x = x;
       this.y = y;
       this.wall = false;
       visited = false;
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

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isWall() {
        return wall;
    }

    public void setWall(boolean wall) {
        this.wall = wall;
    }

    // Draws the each cell
    public void draw(Graphics g) {
        // If the cell is a wall draw it in dark gray
        if (wall) {
            g.setColor(Color.gray);
        }
        // If the cell has been visited draw it in Cyan
        else if (visited) {
            g.setColor(Color.gray);
            g.drawRect(x, y , 50, 50);
            g.setColor(Color.CYAN);
        }
        // If neither draw a light gray cell with a dark gray boarder
        else {
            g.setColor(Color.gray);
            g.drawRect(x, y , 50, 50);
            g.setColor(Color.LIGHT_GRAY);
        }
        g.fillRect(x, y , 50, 50);
    }
}
