public class Ball {
    private static final int START_X = 60,
            START_Y = 60;
    private int x;
    private int y;

    public Ball(){
        this.x = START_X;
        this.y = START_Y;
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

    }
}
