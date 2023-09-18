import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraIMC{
    
    public void createUI() {
        JFrame frame = new JFrame("Calculadora IMC");
        frame.setDefaultCloseOperation(1);

        //Creating the calculator components
        JLabel weightLabel = new JLabel("Peso (kg) (0.00) ");
        JLabel heightLabel = new JLabel("Altura (m) (0.00):");
        JTextField weightField = new JTextField(10);
        JTextField heightField = new JTextField(10);
        JButton calculateButton = new JButton("Calcular IMC");
        JLabel resultLabel = new JLabel("IMC:");
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);

        JPanel panel = new JPanel(new BorderLayout());

        //Creating a input fields panel
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        inputPanel.add(weightLabel);
        inputPanel.add(weightField);
        inputPanel.add(heightLabel);
        inputPanel.add(heightField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(calculateButton);

        JPanel resultPanel = new JPanel();
        resultPanel.add(resultLabel);
        resultPanel.add(resultField);

        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);
        panel.add(resultPanel, BorderLayout.SOUTH);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    double weight = Double.parseDouble(weightField.getText());
                    double height = Double.parseDouble(heightField.getText());

                    double IMC = weight / (height * height);

                    //Displaying the result inside the result field
                    resultField.setText(String.format("%.2f", IMC));

                }catch (NumberFormatException ex) {
                    resultField.setText("Erro");
                }
            }   
        });

        //Addind the main panel to the frame
        frame.add(panel);

        //Setting the dimension and making the frame visible
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
    
}