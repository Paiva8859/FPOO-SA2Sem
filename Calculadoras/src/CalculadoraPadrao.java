import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraPadrao extends JFrame {
    private JTextField displayField;
    private double num1 = 0.0;
    private String operator = "";

    public CalculadoraPadrao() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        displayField = new JTextField();
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.matches("[0-9]")) {
                displayField.setText(displayField.getText() + command);
            } else if (command.matches("[+\\-*/=]")) {
                if (operator.isEmpty()) {
                    num1 = Double.parseDouble(displayField.getText());
                    operator = command;
                    displayField.setText("");
                } else {
                    double num2 = Double.parseDouble(displayField.getText());
                    double result = performOperation(num1, num2, operator);
                    displayField.setText(String.valueOf(result));
                    num1 = result;
                    operator = command.equals("=") ? "" : command;
                }
            } else if (command.equals(".")) {
                if (!displayField.getText().contains(".")) {
                    displayField.setText(displayField.getText() + ".");
                }
            }
        }

        private double performOperation(double num1, double num2, String operator) {
            switch (operator) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    if (num2 != 0) {
                        return num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(CalculadoraPadrao.this, "Divisão por zero não disponivel", "Erro",
                                JOptionPane.ERROR_MESSAGE);
                        return 0.0;
                    }
                default:
                    return num1;
            }
        }
    }
}