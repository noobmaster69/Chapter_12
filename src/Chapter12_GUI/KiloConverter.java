package Chapter12_GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KiloConverter extends JFrame {
    private JPanel panel; //To reference a panel
    private JTextField kiloTextField; // To reference a text field

    /**
     * Constructor
     */

    public KiloConverter(){
        //Set the window title
        setTitle("Kilometer Converter");

        //Set the size of the window
        // Window width
        int WINDOW_WIDTH = 310;
        //Window height
        int WINDOW_HEIGHT = 100;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        //Specify what happens when the close button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Build the panel and add it to the frame
        buildPanel();

        //Add the panel to the frame's content page
        add(panel);

        //Display the window
        setVisible(true);

    }

    /**
     * The buildPanel method adds a label, a text field, and a button to a panel
     */
    private void buildPanel(){
        //Create a label to display instructions
        // To reference a label
        JLabel messageLabel = new JLabel("Enter a distance in kilometers");

        //Create a text field 10 characters wide
        kiloTextField = new JTextField(10);

        //Create a button with the caption "Calculate"
        //To reference a button
        JButton calcButton = new JButton("Calculate");

        //Add an action listenert to the button
        calcButton.addActionListener(new CalcButtonListener());

        //Create a JPanel object and let the panel field reference it
        panel = new JPanel();

        //Add the label, text field and button components to the panel
        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);

    }

    private class CalcButtonListener implements ActionListener{

        /**
         * The actionPerformed method executed when the user
         * clicks on the Calculate button
         * @param e the event to be processed
         */
        public void actionPerformed(ActionEvent e){
            final double CONVERSION = 0.6214;
            String input; //To hold the user's input
            double miles; //The number of miles

            //Get the text entered by the user into the text field
            input = kiloTextField.getText();

            //Convert the input to miles
            miles = Double.parseDouble(input) * CONVERSION;

            //Display the result
            JOptionPane.showMessageDialog(null, input +
                    " kilometers is " + miles + " miles.");
        }
    }

    public static void main(String[] args){
        new KiloConverter();
    }
}
