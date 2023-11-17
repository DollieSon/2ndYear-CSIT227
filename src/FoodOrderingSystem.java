import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame{
    private JPanel jpanel;
    private JButton btnOrder;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderingSystem() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox[] choices = {cPizza,cBurger,cFries,cSoftDrinks,cTea,cSundae};
                int[] prices = {100,80,65,55,50,40};
                JRadioButton[] Discounts = {rbNone,rb5,rb10,rb15};
                double total =0;
                double[] discs = {1,.95,.90,.85};
                for(int x=0;x< choices.length;x++){
                    if(choices[x].isSelected()){
                        total+=(double) prices[x];
                    }
                }for(int x=0;x< Discounts.length;x++){
                    if(Discounts[x].isSelected()){
                        System.out.println(x);
                        total*=discs[x];
                    }
                }
                JOptionPane.showMessageDialog(null,"The total price is Php " + total );

            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.jpanel);
        app.setSize(500, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }
}
