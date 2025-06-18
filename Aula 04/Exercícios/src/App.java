public class App {
    public static void main(String[] args) throws Exception {
    
        Animal cachorro = new Cachorro("Bob");
        Animal gato = new Gato("Luna");

        cachorro.dormir();
        cachorro.emitirSom();

        gato.dormir();
        gato.emitirSom();
    }
    
}

