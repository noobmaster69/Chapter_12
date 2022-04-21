package Chapter12_GUI;

import javax.swing.*;

public class EmbeddedMain extends JFrame {
    final int WINDOW_WIDTH = 350; //Window width in pixels
    final int WINDOW_HEIGHT = 250; //Window height in pixels

    /**Constructor*/

    public EmbeddedMain(){
        //Set this window's title
        setTitle("A Simple Window");

        //Set the size of this window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //Specify what happens when the close button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Display the window
        setVisible(true);

    }

    public static void main(String[] args){
        EmbeddedMain em = new EmbeddedMain();
    }
}
