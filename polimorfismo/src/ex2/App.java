package ex2;

public class App {
    public static void main(String[] args) {
        
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();
        Animal meuPassaro = new Passaro();

        meuCachorro.fazerSom();
        meuGato.fazerSom();
        meuPassaro.fazerSom();

    }
}
