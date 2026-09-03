import javax.swing.JOptionPane;

public class NomeECidade {
    public static void main(String [] args){
        String nome = JOptionPane.showInputDialog("Qual o seu nome? ");
        String cidade = JOptionPane.showInputDialog("Qual a sua cidade? ");
        JOptionPane.showMessageDialog(null, "Oi " + nome + "! Que legal saber que você é da cidade " + cidade + ".");
    }
}
