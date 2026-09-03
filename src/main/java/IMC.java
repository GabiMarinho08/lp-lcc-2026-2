import javax.swing.JOptionPane;

public class IMC {
    public static void main(String [] args){
        String pesoStr = JOptionPane.showInputDialog("Qual o seu peso? ");
        double peso = Double.parseDouble(pesoStr);
        String alturaStr = JOptionPane.showInputDialog("Qual a sua altura? ");
        double altura = Double.parseDouble(alturaStr);
        double imc = peso / ( altura* altura);
        JOptionPane.showMessageDialog(null, "O seu IMC é " + imc);

    }
}
