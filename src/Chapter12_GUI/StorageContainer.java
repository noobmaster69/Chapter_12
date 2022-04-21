package Chapter12_GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StorageContainer extends JFrame{

    private JPanel panel;
    private JTextField storageTextField;

    public StorageContainer(){

        setTitle("Storage Container");

        int WINDOW_WIDTH = 310;
        int WINDOW_HEIGHT = 100;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();
        add(panel);

        setVisible(true);
    }

    public void buildPanel(){
        JLabel messageLabel = new JLabel("Enter the width in meters");

        storageTextField = new JTextField(10);

        JButton calcButton = new JButton("Calculate");

        calcButton.addActionListener(new CalcButtonListener());

        panel = new JPanel();

        panel.add(messageLabel);
        panel.add(storageTextField);
        panel.add(calcButton);
    }

    private class CalcButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            String input;
            double width;



            double cost;

            input = storageTextField.getText();

            cost = (20 * ((Double.parseDouble(input) * Double.parseDouble(input))))+
                    (180 / Double.parseDouble(input));



            JOptionPane.showMessageDialog(null,
                    "A carton that has a width of " + input + " meters wide can cost $ " + cost + " dollars");

        }
    }

    public static void main(String[] args){
        new StorageContainer();
    }
}