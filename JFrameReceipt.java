/*
 * This is used CoffeeShop.java to make the JFrame
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameReceipt extends JFrame implements ActionListener
{
    JLabel label = new JLabel("Would You like a Reciept");
    JButton noButton = new JButton("No");
    JButton yesButton = new JButton("Yes");
    public JFrameReceipt()
    {
   
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(label);
        add(yesButton);
        add(noButton);
        noButton.addActionListener(this);
        yesButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if(source == yesButton)
            label.setText("Check Reciept.txt file for reciept");

        if(source == noButton)
            label.setText("Thank you for your order!");

    }

}
