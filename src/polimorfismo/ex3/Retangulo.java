package ex3;

public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return largura * altura;
    }
}
