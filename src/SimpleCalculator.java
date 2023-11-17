import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JComboBox cbOperations;
    private JPanel jpanel;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JLabel lblResult;

    public SimpleCalculator() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(tfNumber1.getText());
                int num2 = Integer.parseInt(tfNumber2.getText());
                String op = cbOperations.getSelectedItem().toString();
                String res = switch (op) {
                    case "+" -> String.valueOf(num1 + num2);
                    case "-" -> String.valueOf(num1 - num2);
                    case "*" -> String.valueOf(num1 * num2);
                    case "/" -> String.valueOf(num1 / num2);
                    default -> "";
                };
                lblResult.setText(res);

            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.jpanel);
        app.setSize(500, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }

}
