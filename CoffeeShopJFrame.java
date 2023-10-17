/*
 * Marcos Valencia
 * 10/16/2023
 * CoffeeShopJFrame.java
 * This is a version of the coffee shop program that use JFrame checkboxes 
 * and other components to display items avaliable and shows the final price of the order.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CoffeeShopJFrame extends JFrame implements ItemListener 
{
    final double HotCoffee = 6.99;
    final double MochaFrappe = 7.99;
    final double muffin = 5.99;
    final double cookies = 1.99;
    double finalPrice = 0.00;

    JCheckBox HotBox = new JCheckBox("Hot Coffee $" + HotCoffee,false);
    JCheckBox ColdBox = new JCheckBox("mocha frappe $" +MochaFrappe,false);
    JCheckBox muffinBox = new JCheckBox("muffin $"+muffin, false);
    JCheckBox cookiesBox = new JCheckBox("cookies $"+cookies, false);
    
    JLabel TitleLabel = new JLabel("Hello welcome to Valencia Cafe!");
    JLabel price = new JLabel("Total price for order is");
    JLabel Order = new JLabel("Check the box by the item you want");

    JTextField TP = new JTextField(6);

    public CoffeeShopJFrame()
    {
        super("Coffee Shop Order");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        TP.setText("$" +finalPrice);
        HotBox.addItemListener(this);
        ColdBox.addItemListener(this);
        cookiesBox.addItemListener(this);
        muffinBox.addItemListener(this);

        add(TitleLabel);
        add(Order);
        add(ColdBox);
        add(HotBox);
        add(cookiesBox);
        add(muffinBox);
        add(price);
        add(TP);

    }



    @Override
    public void itemStateChanged(ItemEvent event)
    {
        Object s = event.getSource();
        int select = event.getStateChange();
        if(s==HotBox)
            if(select == ItemEvent.SELECTED)
                finalPrice += HotCoffee;
            else
                finalPrice -= HotCoffee;
        else if(s==ColdBox)
            if(select == ItemEvent.SELECTED)
                finalPrice += MochaFrappe;
            else
                finalPrice -= MochaFrappe;
        else if(s==cookiesBox)
        {
            if(select == ItemEvent.SELECTED)
                finalPrice += cookies;
            else
                finalPrice -= cookies;
        }
        else
            if(select == ItemEvent.SELECTED)
                finalPrice += muffin;
            else
                finalPrice -= muffin;
            TP.setText("$" +finalPrice);
    }
    
    public static void main(String[] args)
    {
        CoffeeShopJFrame aFrame = new CoffeeShopJFrame();
        final int width = 400;
        final int height = 300;
        aFrame.setSize(width,height);
        aFrame.setVisible(true);
    }
}
