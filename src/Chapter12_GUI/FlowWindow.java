package Chapter12_GUI;

import javax.swing.*;
import java.awt.*;

public class FlowWindow extends JFrame {

    private final int WINDOW_WIDTH = 200;
    private final int WINDOW_HEIGHT = 105;


    public FlowWindow(){
        //Set title bar text
        setTitle("Flow Layout");

        //Set the size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //Specify an action for the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add a FlowLayout manager to the content pane
        setLayout(new FlowLayout());

        //Create three buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        //Add the three buttons to the content pane
        add(button1);
        add(button2);
        add(button3);

        //Display Window
        setVisible(true);


    }

    /**
     * The main method creates an instance of the FlowWindow
     * class, causing it to display its window
     * @param args
     */
    public static void main(String[] args) {
        new FlowWindow();
    }
}
