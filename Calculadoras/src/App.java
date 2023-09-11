public class App {
    public static void main(String[] args) {
        CalculadoraCombustivel calculadoraCombustivel = new CalculadoraCombustivel();
        calculadoraCombustivel.setVisible(true);

        CalculadoraPadrao calculadoraPadrao = new CalculadoraPadrao();
        calculadoraPadrao.setVisible(true);

        CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
        calculadoraIMC.createUI();
    }
}
