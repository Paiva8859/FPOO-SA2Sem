import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraCombustivel extends JFrame {
    private JTextField rendimentoField;
    private JTextField quilometragemField;
    private JTextField precoField;
    private JLabel resultadoLabel;

    public CalculadoraCombustivel() {
        setTitle("Calculadora de Combustível");
        setDefaultCloseOperation(1);
        setSize(400, 200);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        JLabel rendimentoLabel = new JLabel("Rendimento do veiculo (km/l):");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        panel.add(rendimentoLabel, constraints);

        rendimentoField = new JTextField(10);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(rendimentoField, constraints);

        JLabel quilometragemLabel = new JLabel("Distancia a percorrer (km):");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(quilometragemLabel, constraints);

        quilometragemField = new JTextField(10);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(quilometragemField, constraints);

        JLabel precoLabel = new JLabel("Preço do combustível por litro (R$/l):");
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(precoLabel, constraints);

        precoField = new JTextField(10);
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(precoField, constraints);

        JButton calcularButton = new JButton("Calcular");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        panel.add(calcularButton, constraints);

        resultadoLabel = new JLabel("Custo do combustivel: ");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        panel.add(resultadoLabel, constraints);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double rendimento = Double.parseDouble(rendimentoField.getText());
                    double quilometragem = Double.parseDouble(quilometragemField.getText());
                    double preco = Double.parseDouble(precoField.getText());

                    double custo = (quilometragem / rendimento) * preco;
                    resultadoLabel.setText("Custo estimado da viagem: R$" + String.format("%.2f", custo));
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Valores invalidos ou não informados.");
                }
            }
        });

        add(panel);
    }
}
