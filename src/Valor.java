import java.util.Scanner;

public class Valor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores você vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        
        System.out.println("Valores: ");
        
        for(int i = 0; i<n; i++){
            System.out.printf("%.1f  ",vetor[i]);
        }

        double soma = 0.0;
        for(int i = 0; i<n; i++){
            soma += vetor[i];
        }

        System.out.printf("\nSOMA: %.2f\n", soma);

        double avg = soma / n;
        System.out.printf("MEDIA: %.2f\n", avg);

        sc.close();
    }
}