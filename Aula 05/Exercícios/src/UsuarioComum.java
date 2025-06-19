public class UsuarioComum implements Autenticavel {

    @Override
    public boolean autenticar(String senha) {
        return "123".equals(senha);
    }

}
