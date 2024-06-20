package ex4;

public class App {
    public static void main(String[] args) {
        
        Funcionario gerente = new Gerente();
        Funcionario desenvolvedor = new Desenvolvedor();
        Funcionario estagiario = new Estagiario();

        System.out.println("Salário Gerente: R$" + gerente.calcularSalario());
        System.out.println("Salário Desenvolvedor: R$" + desenvolvedor.calcularSalario());
        System.out.println("Salário Estagiario: R$" + estagiario.calcularSalario());

    }
}
