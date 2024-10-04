import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double soma = 0;
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }
        System.out.print("VALORES: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "  ");
        }
        System.out.println();
        System.out.println("Soma = " + String.format("%.2f", soma));
        System.out.println("Media = " + soma / vetor.length);
        sc.close();
    }
}