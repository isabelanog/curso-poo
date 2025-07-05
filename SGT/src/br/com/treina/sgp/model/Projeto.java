package br.com.treina.sgp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.treina.sgp.enums.StatusProjeto;

public class Projeto {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataConclusao;
    private StatusProjeto status;
    private List<Tarefa> tarefas = new ArrayList<>();

    public void exibirDetalhes() {
        System.out.println("Detalhes do Projeto:");
        System.out.println("Nome: " + getNome());
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Data de início: " + getDataInicio());
        System.out.println("Data de conclusão: " + getDataConclusao());
        System.out.println("Status: " + getStatus());

        if (!tarefas.isEmpty()) {
            System.out.println("Tarefas dos projeto:");
            for (Tarefa tarefa : tarefas) {
                System.out.println("Titulo: " + tarefa.getTitulo());
                System.out.println("Prioridade: " + tarefa.getPrioridade());
                System.out.println("Data de criação " + tarefa.getDataCriacao());
                System.out.println("Status da tarefa: " + tarefa.getStatus());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public StatusProjeto getStatus() {
        return status;
    }

    public void setStatus(StatusProjeto status) {
        this.status = status;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

}
