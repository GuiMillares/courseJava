import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            vetorA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++) {
            vetorB[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Vetor resultante: ");
        for(int i =0; i<n;i++){
            System.out.printf("%d\n", vetorC[i]);
        }

        sc.close();
    }
}
