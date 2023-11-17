import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame{
    private JButton btnCheckYear;
    private JPanel jpanel;
    private JTextField tfYear;

    public LeapYearChecker() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
