import javax.swing.JOptionPane;
public class Media {
    public static void main ( String [] args){
        String nota1Str = JOptionPane.showInputDialog("Primeira Nota: ");
        double nota1 = Double.parseDouble(nota1Str);
        String nota2Str = JOptionPane.showInputDialog("Segunda Nota: ");
        double nota2 = Double.parseDouble(nota2Str);
        double media = (nota1 + nota2)/2;
        JOptionPane.showMessageDialog(null, "A média das notas é "+ media);
    }
}
