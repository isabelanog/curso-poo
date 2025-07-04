# Projeto de Gerenciamento de Usuários, Projetos e Tarefas

## 📄 Descrição

Crie um diagrama UML antes de implementar das seguintes classes enumeradas abaixo.



##  Classes a serem construídas

###  Classe `Usuario`

- **Atributos**:
  - `nome`: String
  - `cpf`: String
  - `email`: String
  - `senha`: String
  - `dataDeNascimento`: String
  - `status`: StatusUsuario (enum)
  - `tarefas`: Lista de Tarefa

### Classe `Projeto`

- **Atributos**:
  - `nome`: String
  - `descricao`: String
  - `dataInicio`: String
  - `dataConclusao`: String
  - `status`: StatusProjeto (enum)
  - `tarefas`: Lista de Tarefa



###  Classe `Tarefa`

- **Atributos**:
  - `titulo`: String
  - `dataCriacao`: String
  - `prioridade`: Prioridade (enum)
  - `status`: StatusTarefa (enum)



##  Enums a serem construídos

###  Enum `StatusUsuario`
- ATIVO
- INATIVO
- BLOQUEADO



###  Enum `Prioridade`
- BAIXA
- MEDIA
- ALTA



### ✅ Enum `StatusTarefa`
- PENDENTE
- FAZENDO
- CONCLUIDA



###  Enum `StatusProjeto`
- ATIVO
- CONCLUIDO
- CANCELADO



## 💬 Observações

- As classes `Usuario` e `Projeto` possuem uma **lista de tarefas** (relacionamento 1:N).
- Recomendado usar **LocalDate** para datas em vez de String, caso precise trabalhar com operações de data.
.


