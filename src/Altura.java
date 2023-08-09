import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int menores = 0;
        double alturatotal = 0.0;
        for(int i = 0; i < n; i++){
            if(idade[i] < 16){
                menores++;
            }
            alturatotal = alturatotal + altura[i];
        }

        double porcentagemMenores = ((double) menores / n) * 100;
        double alturamedia = alturatotal / n;
        System.out.printf("\nIdade menor que 16: %.1f%%\n", porcentagemMenores);
        System.out.printf("MEDIA: %.2f\n", alturamedia);

        for(int i = 0; i < n; i++){
            if(idade[i] < 16){
                System.out.printf("%s\n", nomes[i]);
            }
        }

        sc.close();
    }
}
