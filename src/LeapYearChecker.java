import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class LeapYearChecker extends JFrame{
    private JButton btnCheckYear;
    private JPanel jpanel;
    private JTextField tfYear;

    public LeapYearChecker() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Objects.equals(tfYear.getText(), "")){
                    JOptionPane.showMessageDialog(null,"Text Area Must Be Filled");
                    return;
                }
                int num = Integer.parseInt(tfYear.getText());
                if(num%4 == 0 && num%100==0 && num%400 == 0){
                    JOptionPane.showMessageDialog(null,"Leap Year");
                }else{
                    JOptionPane.showMessageDialog(null,"Not a leap Year");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
        app.setContentPane(app.jpanel);
        app.setSize(500, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
