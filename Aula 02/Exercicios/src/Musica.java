public class Musica {
    
 private String titulo;
    private String artista;
    private int duracao; // em segundos

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setDuracao(int duracao) {
        if (duracao > 0) {
            this.duracao = duracao;
        } else {
            System.out.println("Duração inválida.");
        }
    }

    public int getDuracao() {
        return duracao;
    }

    public void exibirInfo() {
        int minutos = duracao / 60;
        int segundos = duracao % 60;
        System.out.printf("Música: %s - %s (%dm %ds)%n", titulo, artista, minutos, segundos);
    }
}
