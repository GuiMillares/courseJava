package ex3;

public class App {
    public static void main(String[] args) {
        
        Forma circulo = new Circulo(7);
        Forma triangulo = new Triangulo(10, 15);
        Forma retangulo = new Retangulo(15, 35);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());

    }
}
