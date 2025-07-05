package br.com.treina.sgp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import br.com.treina.sgp.enums.StatusUsuario;

public class Usuario {

    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private LocalDate dataNascimento;
    private StatusUsuario status;
    private List<Tarefa> tarefas = new ArrayList<>();

    public void exibirDetalhes() {
        System.out.println("Exibindo detalhes do usuário:");
        System.out.println("Nome: " + getNome());
        System.err.println("CPF " + getCpf());
        System.out.println("Email: " + getEmail());
        System.out.println("Status: " + getStatus());

        if (!tarefas.isEmpty()) {
            System.out.println("Tarefas atribuídas:");
            for (Tarefa tarefa : tarefas) {
                System.out.println(tarefa.getTitulo());
            }
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public StatusUsuario getStatus() {
        return status;
    }

    public void setStatus(StatusUsuario status) {
        this.status = status;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    
}
