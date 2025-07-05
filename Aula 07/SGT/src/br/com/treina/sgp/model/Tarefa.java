package br.com.treina.sgp.model;

import java.time.LocalDate;

import br.com.treina.sgp.enums.Prioridade;
import br.com.treina.sgp.enums.StatusTarefa;

public class Tarefa {

    private String titulo;
    private Prioridade prioridade;
    private LocalDate dataCriacao;
    private StatusTarefa status;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public StatusTarefa getStatus() {
        return status;
    }

    public void setStatus(StatusTarefa status) {
        this.status = status;
    }

}
