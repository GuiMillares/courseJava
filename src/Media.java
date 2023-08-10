import java.util.Scanner;

public class Media {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        for(int i=0;i<n;i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for(int i = 0; i<n; i++){
            soma = soma + vetor[i];
        }

        double media = soma / n;
        System.out.printf("\nMedia do Vetor: %.3f\n", media);
        System.out.println("Elementos abaixo da media:");

        for(int i = 0; i<n; i++){
            if(vetor[i] < media){
                System.out.printf("%.1f\n", vetor[i]);
            }
        }




        sc.close();
    }
}
