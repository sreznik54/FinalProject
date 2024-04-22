public class MazeCell {
    private int x;
    private int y;
    private boolean visited;
    private boolean wall;

    // Constructs the cell
    public MazeCell(int x, int y, boolean wall)
    {
       this.x = x;
       this.y = y;
       this.wall = wall;
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
}
