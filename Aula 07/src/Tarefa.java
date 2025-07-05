public class Tarefa {
    private String titulo;
    private String dataCriacao;
    private Prioridade prioridade;
    private StatusTarefa status;

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    public Prioridade getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }
    public StatusTarefa getStatus() {
        return status;
    }
    public void setStatus(StatusTarefa status) {
        this.status = status;
    }
}
