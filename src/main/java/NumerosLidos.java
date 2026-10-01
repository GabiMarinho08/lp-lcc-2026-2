import java.util.Scanner;

public class NumerosLidos {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[5];


        for (int k = 0; k < 5; k++) {
            System.out.println("Digite o "+ (k + 1) + "º número inteiro:");
            numeros[k] = Integer.parseInt(leitor.nextLine());


        }

        int menor = numeros[0];

        for (int k = 1; k < numeros.length; k++) {
            if (numeros[k] < menor) {
                menor = numeros[k];
            }
        }

        System.out.println("O menor número foi: " + menor);

        leitor.close();
    }

}