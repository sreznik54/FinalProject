import javax.swing.*;
import java.awt.*;


public class AmazeVeiw extends JFrame{
    private static final int WINDOW_WIDTH = 600,
            WINDOW_HEIGHT = 600;


    private Amaze game;

    // Constructs the game window
    public AmazeVeiw(Amaze a) {
        // Passes in the backend
        this.game = a;
        // Initializes all the background images

        // Constructs the window
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setTitle("AMAZE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    // Draws the number of moves the player has done in the top left corner
    public void drawScore(Graphics g){
            g.setColor(Color.WHITE);
            g.setFont(new Font(Font.SERIF, Font.BOLD, 30));
            g.drawString("Moves: " + String.valueOf(game.getMoves()), 10, 60 );
    }

    // Draws the game
    public void paint(Graphics g)
    {
        // Draws the board
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                game.getBoard()[i][j].draw(g);
            }
        }
        // Draws the ball
        game.getB().draw(g);
        // Draws the score
        drawScore(g);
    }
}
