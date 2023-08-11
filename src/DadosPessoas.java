import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, qtdhomens, qtdmulheres;
        double menoraltura, maioraltura, alturafemMedia, alturafemtotal;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();
        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
        }

        menoraltura = altura[0];
        maioraltura = altura[0];

        for (int i = 1; i < n; i++) {
            if (altura[i] > maioraltura) {
                maioraltura = altura[i];
            }
            if (altura[i] < menoraltura) {
                menoraltura = altura[i];
            }
        }

        qtdhomens = 0;
        qtdmulheres = 0;
        alturafemtotal = 0;
        for (int i = 0; i < n; i++) {
            if (genero[i] == 'M') {
                qtdhomens++;
            } else {
                qtdmulheres++;
                alturafemtotal = alturafemtotal + altura[i];
            }
        }

        alturafemMedia = alturafemtotal / qtdmulheres;

        System.out.printf("Menor altura = %.2f\n", menoraltura);
        System.out.printf("Maior altura = %.2f\n", maioraltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
        System.out.printf("Numero de homens = %d\n", qtdhomens);

        sc.close();
    }
}