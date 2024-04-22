import javax.swing.*;
import java.awt.*;

public class AmazeVeiw extends JFrame{
    private static final int WINDOW_WIDTH = 600,
            WINDOW_HEIGHT = 600;


    private Amaze game;

    // Constructs the window
    public AmazeVeiw(Amaze a) {
        // Passes in the backend
        this.game = a;
        // Initializes all the background images

        // Constructs the window
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setTitle("BLACK JACK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
