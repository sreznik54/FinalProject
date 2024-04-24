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

    public void paint(Graphics g)
    {
        // Color the entire KeyListenerDemo window white
        // First set the Graphics Color "state" to WHITE
        g.setColor(Color.gray);

        // Because g.Color was set to WHITE, the rectangle will be WHITE
        g.fillRect(0,  0, WINDOW_WIDTH, WINDOW_HEIGHT);

        // Now have the ball draw itself on top of the White window.
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                game.getBoard()[i][j].draw(g);
            }
        }
        game.getB().draw(g);
    }
}
