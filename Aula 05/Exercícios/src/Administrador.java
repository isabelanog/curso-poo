public class Administrador implements Autenticavel {

    @Override
    public boolean autenticar(String senha) {
        return "admin123".equals(senha);
    }

}
