import java.util.Scanner;

public class SomaPar {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);

        int somaPares = 0, npares = 0, media;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(vetor[i] % 2 == 0){
                somaPares = somaPares + vetor[i];
                npares++;
            }
        }
        if(npares == 0){
            System.out.print("NENHUM NUMERO PAR");
        }else{
            media = somaPares / npares;
            System.out.printf("MEDIA DOS PARES = %d ", media);
        }
        sc.close();
    }
}
