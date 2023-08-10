import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        int maior = vetor[0];
        int posicaoMaior = 0;
        for(int i = 1; i<n; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("Maior valor = %d\n", maior);
        System.out.printf("Posicao do maior valor = %d\n", posicaoMaior);

        sc.close();
    }
}
