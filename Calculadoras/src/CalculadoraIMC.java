import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraIMC{
    
    public void createUI() {
        //Creating a JFrame
        JFrame frame = new JFrame("Calculadora IMC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creating the calculator components
        JLabel weightLabel = new JLabel("Peso (kg) (0.00) ");
        JLabel heightLabel = new JLabel("Altura (m) (0.00):");
        JTextField weightField = new JTextField(10);
        JTextField heightField = new JTextField(10);
        JButton calculateButton = new JButton("Calcular IMC");
        JLabel resultLabel = new JLabel("IMC:");
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);
        //Creating a BorderLayout panel
        JPanel panel = new JPanel(new BorderLayout());

        //Creating a input fields panel
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        inputPanel.add(weightLabel);
        inputPanel.add(weightField);
        inputPanel.add(heightLabel);
        inputPanel.add(heightField);

        //Creating a panel to the calc button
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(calculateButton);

        //Creating a panel to display the result
        JPanel resultPanel = new JPanel();
        resultPanel.add(resultLabel);
        resultPanel.add(resultField);

        //Adding the panels into the main panel
        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.CENTER);
        panel.add(resultPanel, BorderLayout.SOUTH);

        //Add a listener to the calc button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                //Getting the data from weight and height fields
                try{
                    double altura = Double.parseDouble(weightField.getText());
                    double peso = Double.parseDouble(heightField.getText());

                    double IMC = peso / (altura * altura);

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