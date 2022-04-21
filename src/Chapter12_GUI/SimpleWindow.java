package Chapter12_GUI;

import javax.swing.*;

public class SimpleWindow extends JFrame {

    public SimpleWindow() {
        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

        //Set this window's title
        setTitle("A simple Window");

        //Set the size of this window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //Specify what happens when the close button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Display the window
        setVisible(true);
    }

}
