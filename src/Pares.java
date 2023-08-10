import java.util.Scanner;

public class Pares {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for(int i = 0; i<n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("\nNumeros pares: ");

        int pares = 0;
        for (int i = 0; i<n; i++){
            if(vetor[i] % 2 == 0){
                System.out.printf("%d ", vetor[i]);
                pares++;
            }
        }
        
        System.out.printf("\n\nQuantidade de pares = %d\n", pares);

        sc.close();
    }
}
