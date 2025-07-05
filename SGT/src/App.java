import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.treina.sgp.enums.Prioridade;
import br.com.treina.sgp.enums.StatusProjeto;
import br.com.treina.sgp.enums.StatusTarefa;
import br.com.treina.sgp.enums.StatusUsuario;
import br.com.treina.sgp.model.Projeto;
import br.com.treina.sgp.model.Tarefa;
import br.com.treina.sgp.model.Usuario;

public class App {
    public static void main(String[] args) throws Exception {

    Tarefa tarefaUm = new Tarefa();
    tarefaUm.setTitulo("Desenvolver protótipo de interface do usuário");
    tarefaUm.setDataCriacao(LocalDate.of(2025,07,05));
    tarefaUm.setPrioridade(Prioridade.BAIXA);
    tarefaUm.setStatus(StatusTarefa.PENDENTE);

    Tarefa tarefaDois = new Tarefa();
    tarefaDois.setTitulo("Integrar sistema de autenticação de usuários");
    tarefaDois.setDataCriacao(LocalDate.of(2025,07,05));
    tarefaDois.setPrioridade(Prioridade.ALTA);
    tarefaDois.setStatus(StatusTarefa.FAZENDO);

    Tarefa tarefaTres = new Tarefa();
    tarefaTres.setTitulo("Configurar ambiente de testes e homologação");
    tarefaTres.setDataCriacao(LocalDate.of(2025,07,05));
    tarefaTres.setPrioridade(Prioridade.URGENTE);
    tarefaTres.setStatus(StatusTarefa.CONLCUIDA);

    List<Tarefa> tarefas = new ArrayList<>();
    tarefas.add(tarefaUm);
    tarefas.add(tarefaDois);
    tarefas.add(tarefaTres);
    
    Usuario usuario = new Usuario();
    usuario.setNome("Priscylla");
    usuario.setDataNascimento(LocalDate.of(1993,03,12));
    usuario.setEmail("priscylla@email.com");
    usuario.setCpf("123.456.789-12");
    usuario.setSenha("senha123");
    usuario.setStatus(StatusUsuario.ATIVO);
    usuario.setTarefas(tarefas);

    Projeto projeto = new Projeto();
    projeto.setNome("Implementação do Novo Portal Institucional");
    projeto.setDataInicio(LocalDate.of(2025,05,01));
    projeto.setDataConclusao(LocalDate.of(2025,07,06));
    projeto.setDescricao("Novo portal da Prefeitura do Recife");
    projeto.setStatus(StatusProjeto.ATIVO);
    projeto.setTarefas(tarefas);
    projeto.exibirDetalhes();
    System.out.println("------------------------------");
    usuario.exibirDetalhes();

    }
}
